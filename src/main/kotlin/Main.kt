import lang.Languages

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
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
            forEachIndexed { index, lang ->
                Translator.translate("strings.xml", lang)
            }
        }
    }
}