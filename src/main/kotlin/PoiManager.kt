import org.apache.poi.hssf.usermodel.HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.jsoup.Jsoup
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.*


object PoiManager {


    fun updateStringTranslation() {
        val file = FileInputStream(File("strings.xlsx"))
        val workbook = HSSFWorkbook(file)
        val sheet: HSSFSheet = workbook.getSheetAt(0)
        val rowIterator: Iterator<Row> = sheet.iterator()
        while (rowIterator.hasNext()) {
            val row = rowIterator.next()
            val cellIterator = row.cellIterator()
            while (cellIterator.hasNext()) {
                val cell = cellIterator.next()
                when (cell.cellType) {
                    CellType.NUMERIC -> print(cell.numericCellValue.toString() + "t")
                    CellType.STRING -> print(cell.stringCellValue + "t")
                }
            }
            println("")
        }
        file.close()

    }

    fun writeStringXmlToExecl() {
        val filePath = "strings.xml"
        val list = getToTranslateList(filePath)
        val workbook = HSSFWorkbook()
        val sheet = workbook.createSheet("translation")
        val row = sheet.createRow(0)
        val cellName = row.createCell(0)
        cellName.setCellValue("name")
        val cellEn = row.createCell(1)
        cellEn.setCellValue("en")
        val style = workbook.createCellStyle()
        style.alignment = HorizontalAlignment.CENTER
        style.verticalAlignment = VerticalAlignment.CENTER
        cellEn.setCellStyle(style)
        list.forEachIndexed { index, pair ->
            sheet.autoSizeColumn(index)
            val row = sheet.createRow(index + 1)
            val cell = row.createCell(0)
            cell.setCellValue(pair.first)
            val cellSecond = row.createCell(1)
            cellSecond.setCellValue(pair.second)
            cellSecond.setCellStyle(style)
        }
        try {
            val out = FileOutputStream(File("strings.xlsx"))
            workbook.write(out)
            out.close()
            println("strings.xlsx written successfully on disk.")
        } catch (e: Exception) {
            e.printStackTrace()
        }
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

    fun test() {
        val workbook = HSSFWorkbook()
        val sheet = workbook.createSheet("Employee Data")
        //This data needs to be written (Object[])
        val data: MutableMap<String, Array<Any>> = TreeMap()
        data["1"] = arrayOf("ID", "NAME", "LASTNAME")
        data["2"] = arrayOf(1, "Amit", "Shukla")
        data["3"] = arrayOf(2, "Lokesh", "Gupta")
        data["4"] = arrayOf(3, "John", "Adwards")
        data["5"] = arrayOf(4, "Brian", "Schultz")
        //Iterate over data and write to sheet
        val keyset: Set<String> = data.keys
        for ((rownum, key) in keyset.withIndex()) {
            val row: Row = sheet.createRow(rownum)
            val objArr = data[key]!!
            for ((cellnum, obj) in objArr.withIndex()) {
                val cell: Cell = row.createCell(cellnum)
                if (obj is String) cell.setCellValue(obj) else if (obj is Int) cell.setCellValue(obj.toDouble())
            }
        }
        try {
            //Write the workbook in file system
            val out = FileOutputStream(File("howtodoinjava_demo.xlsx"))
            workbook.write(out)
            out.close()
            println("howtodoinjava_demo.xlsx written successfully on disk.")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    fun readTest() {
        try {
            val file = FileInputStream(File("howtodoinjava_demo.xlsx"))

            //Create Workbook instance holding reference to .xlsx file
            val workbook = HSSFWorkbook(file)

            //Get first/desired sheet from the workbook
            val sheet: HSSFSheet = workbook.getSheetAt(0)

            //Iterate through each rows one by one
            val rowIterator: Iterator<Row> = sheet.iterator()
            while (rowIterator.hasNext()) {
                val row = rowIterator.next()
                //For each row, iterate through all the columns
                val cellIterator = row.cellIterator()
                while (cellIterator.hasNext()) {
                    val cell = cellIterator.next()
                    when (cell.cellType) {
                        CellType.NUMERIC -> print(cell.numericCellValue.toString() + "t")
                        CellType.STRING -> print(cell.stringCellValue + "t")
                    }
                }
                println("")
            }
            file.close()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }
}