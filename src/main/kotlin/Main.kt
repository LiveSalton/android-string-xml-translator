import br.com.ars3ne.internationale.translators.GoogleTranslate
import lang.Languages
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
//        translateImprint()
//        translateFullImprint()
//        PoiManager.test()
//        PoiManager.writeStringXmlToExecl()
//        PoiManager.updateStringTranslation()
//        Translator.translate("res/values/strings.xml", Languages.LUXEMBOURGISH)

        translate()
    }

    fun translate() {
//        Translator.translate("res/values/strings.xml", Languages.CHINESE_SIMPLIFIED)
        Languages.languages.apply {
            remove(Languages.ASSAMESE)
            remove(Languages.ENGLISH)
            remove(Languages.FIJIAN)
            remove(Languages.INUKTITUT)
            remove(Languages.HMONG_DAW)
            remove(Languages.QUERETARO_OTOMI)
            remove(Languages.DARI)
            remove(Languages.TIGRINYA)
            remove(Languages.KLINGON_LATIN)
            remove(Languages.KLINGON_PIQAD)
            remove(Languages.TONGAN)
            remove(Languages.TAHITIAN)
            remove(Languages.YUCATEC_MAYA)
            remove(Languages.AUTO)
            forEachIndexed { index, lang ->
                Translator.translate("res/values/strings.xml", lang)
            }
        }
    }

    fun translateReadMe() {
        val stringBuilder = StringBuilder()
        stringBuilder.append("# android-string-xml-translator\n")
        stringBuilder.append("### A simple implementation of android application internationalization language tool\n")
        val template = "* %s \n     %s\n"
        val rawString = "A simple implementation of android application internationalization language tool"
        Languages.languages.apply {
            remove(Languages.ASSAMESE)
            remove(Languages.ENGLISH)
            remove(Languages.FIJIAN)
            remove(Languages.INUKTITUT)
            remove(Languages.HMONG_DAW)
            remove(Languages.QUERETARO_OTOMI)
            remove(Languages.DARI)
            remove(Languages.TIGRINYA)
            remove(Languages.KLINGON_LATIN)
            remove(Languages.KLINGON_PIQAD)
            remove(Languages.TONGAN)
            remove(Languages.TAHITIAN)
            remove(Languages.YUCATEC_MAYA)
            remove(Languages.AUTO)
            forEachIndexed { index, lang ->
                val ret = GoogleTranslate().translate(rawString, lang.code)
                println(ret)
                stringBuilder.append(String.format(template, lang.englishName, ret))
            }
            val path = Paths.get("README.md")
//            if (!path.parent.exists()) {
//                Files.createDirectories(path.parent)
//            }
            if (Files.exists(path)) {
                Files.delete(path)
            }
            Files.createFile(path)
            Files.write(path, stringBuilder.toString().toByteArray(), StandardOpenOption.TRUNCATE_EXISTING)
            println("wrote file :$path")
        }
    }

    fun translateImprint() {
        val stringBuilder = StringBuilder()
        val template = "<%s>\n%s\n</%s>\n"
        val rawString =
            "???????????????????????????H264???H265???mpeg4??????+???????????????????????????+????????????????????????+??????????????????????????????+????????????????????????+???????????????????????????+????????????????????????+????????????????????????+??????apk??????\n"
        Languages.languages.apply {
            remove(Languages.ASSAMESE)
            remove(Languages.FIJIAN)
            remove(Languages.INUKTITUT)
            remove(Languages.HMONG_DAW)
            remove(Languages.QUERETARO_OTOMI)
            remove(Languages.DARI)
            remove(Languages.TIGRINYA)
            remove(Languages.KLINGON_LATIN)
            remove(Languages.KLINGON_PIQAD)
            remove(Languages.TONGAN)
            remove(Languages.TAHITIAN)
            remove(Languages.YUCATEC_MAYA)
            remove(Languages.AUTO)
            forEachIndexed { index, lang ->
                var ret = GoogleTranslate().translate(rawString, lang.code)
                ret = ret.replace("+", "\n")
                println(ret)
                stringBuilder.append(String.format(template, lang.code, ret, lang.code))
            }
            val path = Paths.get("imprint.txt")
            if (Files.exists(path)) {
                Files.delete(path)
            }
            Files.createFile(path)
            Files.write(path, stringBuilder.toString().toByteArray(), StandardOpenOption.TRUNCATE_EXISTING)
            println("wrote file :$path")
        }
    }

    fun translateFullImprint() {
        val stringBuilder = StringBuilder()
        val template = "<%s>\n%s\n</%s>\n"
        val rawString =
            "???????????????+??????????????????????????????????????????+* ??????h264???h265???mpeg4???????????????+* ????????????:??????80%????????????????????????????????????????????????+* ????????????????????????:??????????????????????????????????????????????????????????????????????????????\n"
        Languages.languages.apply {
            remove(Languages.ASSAMESE)
            remove(Languages.FIJIAN)
            remove(Languages.INUKTITUT)
            remove(Languages.HMONG_DAW)
            remove(Languages.QUERETARO_OTOMI)
            remove(Languages.DARI)
            remove(Languages.TIGRINYA)
            remove(Languages.KLINGON_LATIN)
            remove(Languages.KLINGON_PIQAD)
            remove(Languages.TONGAN)
            remove(Languages.TAHITIAN)
            remove(Languages.YUCATEC_MAYA)
            remove(Languages.AUTO)
            forEachIndexed { index, lang ->
                var ret = GoogleTranslate().translate(rawString, lang.code)
                ret = ret.replace("+", "\n")
                println(ret)
                stringBuilder.append(String.format(template, lang.code, ret, lang.code))
            }
            val path = Paths.get("fullImprint.txt")
            if (Files.exists(path)) {
                Files.delete(path)
            }
            Files.createFile(path)
            Files.write(path, stringBuilder.toString().toByteArray(), StandardOpenOption.TRUNCATE_EXISTING)
            println("wrote file :$path")
        }
    }
}