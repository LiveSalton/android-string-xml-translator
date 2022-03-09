import br.com.ars3ne.internationale.translators.GoogleTranslate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import lang.Lang
import lang.Languages
import org.jsoup.Jsoup
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import kotlin.io.path.exists


object Translator {
    private val googleTranslator: GoogleTranslate = GoogleTranslate()
    fun translate(filePath: String, language: Lang) {
        val list = getToTranslateList(filePath)
        list.forEach {
            try {
                val translatedContent = googleTranslator.translate(it.second, language.code)
                println("${it.second}->$translatedContent")
                it.second = translatedContent
            } catch (ex: Exception) {
                //
            }
        }
        writeTranslateList(list, language)
    }

    private fun getToTranslateList(filePath: String): MutableList<Pair> {
        val doc = Jsoup.parse(File(filePath), "UTF-8")
        val elements = doc.body().getElementsByTag("resources")[0]
        val toTranslateList: MutableList<Pair> = mutableListOf()
        for (index in 0 until elements.childrenSize()) {
            val name = elements.child(index).attr("name")
            val text = elements.child(index).html()
            toTranslateList.add(Pair(name, text))
        }
        return toTranslateList
    }

    private fun translateList(list: MutableList<Pair>, language: Lang): MutableList<Pair> {
        val targetBuilder = StringBuilder()
        val separator = ">"
        list.forEach {
            targetBuilder.append(it.second).append(separator)
        }
        println(targetBuilder)
        try {
            val translatedContent = googleTranslator.translate(targetBuilder.toString(), language.code)
            println(translatedContent)
            translatedContent.split(separator).apply {
                if (size == list.size) {
                    forEachIndexed { index, s ->
                        list[index].second = s.trim()
                    }
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return list
    }

    private fun writeTranslateList(list: MutableList<Pair>, language: Lang) {
        val targetBuilder = StringBuilder()
        targetBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n")
        targetBuilder.append("<resources>\n")
        val template = "    <string name=\"%s\">%s</string>\n"
        list.forEach {
            targetBuilder.append(String.format(template, it.first, it.second))
        }
        targetBuilder.append("</resources>\n")
        val path = Paths.get("output/${Languages.getValuesDirectoryName(language)}/strings.xml")
        if (!path.parent.exists()) {
            Files.createDirectories(path.parent)
        }
        if (Files.exists(path)) {
            Files.delete(path)
        }
        Files.createFile(path)
        Files.write(path, targetBuilder.toString().toByteArray(), StandardOpenOption.TRUNCATE_EXISTING)
        println("wrote file :$path")
    }
}