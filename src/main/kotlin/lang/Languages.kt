/*
 * Copyright 2021 Airsaid. https://github.com/airsaid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package lang

import java.util.*


/**
 * @author airsaid
 */
object Languages {
    val AUTO = Lang(0, "auto", "Auto", "Auto")
    val ALBANIAN = Lang(1, "sq", "Shqiptar", "Albanian")
    val ARABIC = Lang(2, "ar", "العربية", "Arabic")
    val AMHARIC = Lang(3, "am", "አማርኛ", "Amharic")
    val AZERBAIJANI = Lang(4, "az", "азәрбајҹан", "Azerbaijani")
    val IRISH = Lang(5, "ga", "Gaeilge", "Irish")
    val ESTONIAN = Lang(6, "et", "Eesti", "Estonian")
    val BASQUE = Lang(7, "eu", "Euskal", "Basque")
    val BELARUSIAN = Lang(8, "be", "беларускі", "Belarusian")
    val BULGARIAN = Lang(9, "bg", "Български", "Bulgarian")
    val ICELANDIC = Lang(10, "is", "Íslenska", "Icelandic")
    val POLISH = Lang(11, "pl", "Polski", "Polish")
    val BOSNIAN = Lang(12, "bs", "Bosanski", "Bosnian")
    val PERSIAN = Lang(13, "fa", "Persian", "Persian")
    val AFRIKAANS = Lang(14, "af", "Afrikaans", "Afrikaans")
    val DANISH = Lang(15, "da", "Dansk", "Danish")
    val GERMAN = Lang(16, "de", "Deutsch", "German")
    val RUSSIAN = Lang(17, "ru", "Русский", "Russian")
    val FRENCH = Lang(18, "fr", "Français", "French")
    val FILIPINO = Lang(19, "tl", "Filipino", "Filipino")
    val FINNISH = Lang(20, "fi", "Suomi", "Finnish")
    val FRISIAN = Lang(21, "fy", "Frysk", "Frisian")
    val KHMER = Lang(22, "km", "ខ្មែរ", "Khmer")
    val GEORGIAN = Lang(23, "ka", "ქართული", "Georgian")
    val GUJARATI = Lang(24, "gu", "ગુજરાતી", "Gujarati")
    val KAZAKH = Lang(25, "kk", "Kazakh", "Kazakh")
    val HAITIAN_CREOLE = Lang(26, "ht", "Haitian Creole", "Haitian Creole")
    val KOREAN = Lang(27, "ko", "한국어", "Korean")
    val HAUSA = Lang(28, "ha", "Hausa", "Hausa")
    val DUTCH = Lang(29, "nl", "Nederlands", "Dutch")
    val KYRGYZ = Lang(30, "ky", "Кыргыз тили", "Kyrgyz")
    val GALICIAN = Lang(31, "gl", "Galego", "Galician")
    val CATALAN = Lang(32, "ca", "Català", "Catalan")
    val CZECH = Lang(33, "cs", "Čeština", "Czech")
    val KANNADA = Lang(34, "kn", "ಕನ್ನಡ", "Kannada")
    val CORSICAN = Lang(35, "co", "Corsa", "Corsican")
    val CROATIAN = Lang(36, "hr", "Hrvatski", "Croatian")
    val KURDISH = Lang(37, "ku", "Kurdî", "Kurdish")
    val LATIN = Lang(38, "la", "Latina", "Latin")
    val LATVIAN = Lang(39, "lv", "Latviešu", "Latvian")
    val LAO = Lang(40, "lo", "ລາວ", "Lao")
    val LITHUANIAN = Lang(41, "lt", "Lietuvių", "Lithuanian")
    val LUXEMBOURGISH = Lang(42, "lb", "Lëtzebuergesch", "Luxembourgish")
    val ROMANIAN = Lang(43, "ro", "Română", "Romanian")
    val MALAGASY = Lang(44, "mg", "Malagasy", "Malagasy")
    val MALTESE = Lang(45, "mt", "Il-Malti", "Maltese")
    val MARATHI = Lang(46, "mr", "मराठी", "Marathi")
    val MALAYALAM = Lang(47, "ml", "മലയാളം", "Malayalam")
    val MALAY = Lang(48, "ms", "Melayu", "Malay")
    val MACEDONIAN = Lang(49, "mk", "Македонски", "Macedonian")
    val MAORI = Lang(50, "mi", "Māori", "Maori")
    val MONGOLIAN = Lang(51, "mn", "Монгол хэл", "Mongolian")
    val BANGLA = Lang(52, "bn", "বাংল", "Bangla")
    val BURMESE = Lang(53, "my", "မြန်မာ", "Burmese")
    val HMONG = Lang(54, "hmn", "Hmoob", "Hmong")
    val XHOSA = Lang(55, "xh", "IsiXhosa", "Xhosa")
    val ZULU = Lang(56, "zu", "Zulu", "Zulu")
    val NEPALI = Lang(57, "ne", "नेपाली", "Nepali")
    val NORWEGIAN = Lang(58, "no", "Norsk", "Norwegian")
    val PUNJABI = Lang(59, "pa", "ਪੰਜਾਬੀ", "Punjabi")
    val PORTUGUESE = Lang(60, "pt", "Português", "Portuguese")
    val PASHTO = Lang(61, "ps", "Pashto", "Pashto")
    val CHICHEWA = Lang(62, "ny", "Chichewa", "Chichewa")
    val JAPANESE = Lang(63, "ja", "日本語", "Japanese")
    val SWEDISH = Lang(64, "sv", "Svenska", "Swedish")
    val SAMOAN = Lang(65, "sm", "Samoa", "Samoan")
    val SERBIAN = Lang(66, "sr", "Српски", "Serbian")
    val SOTHO = Lang(67, "st", "Sesotho", "Sotho")
    val SINHALA = Lang(68, "si", "සිංහල", "Sinhala")
    val ESPERANTO = Lang(69, "eo", "Esperanta", "Esperanto")
    val SLOVAK = Lang(70, "sk", "Slovenčina", "Slovak")
    val SLOVENIAN = Lang(71, "sl", "Slovenščina", "Slovenian")
    val SWAHILI = Lang(72, "sw", "Kiswahili", "Swahili")
    val SCOTTISH_GAELIC = Lang(73, "gd", "Gàidhlig na h-Alba", "Scottish Gaelic")
    val CEBUANO = Lang(74, "ceb", "Cebuano", "Cebuano")
    val SOMALI = Lang(75, "so", "Somali", "Somali")
    val TAJIK = Lang(76, "tg", "Тоҷикӣ", "Tajik")
    val TELUGU = Lang(77, "te", "తెలుగు", "Telugu")
    val TAMIL = Lang(78, "ta", "தமிழ்", "Tamil")
    val THAI = Lang(79, "th", "ไทย", "Thai")
    val TURKISH = Lang(80, "tr", "Türkçe", "Turkish")
    val WELSH = Lang(81, "cy", "Cymraeg", "Welsh")
    val URDU = Lang(82, "ur", "اردو", "Urdu")
    val UKRAINIAN = Lang(83, "uk", "Українська", "Ukrainian")
    val UZBEK = Lang(84, "uz", "O'zbek", "Uzbek")
    val SPANISH = Lang(85, "es", "Español", "Spanish")
    val HEBREW = Lang(86, "iw", "עברית", "Hebrew")
    val GREEK = Lang(87, "el", "Ελληνικά", "Greek")
    val HAWAIIAN = Lang(88, "haw", "Hawaiian", "Hawaiian")
    val SINDHI = Lang(89, "sd", "سنڌي", "Sindhi")
    val HUNGARIAN = Lang(90, "hu", "Magyar", "Hungarian")
    val SHONA = Lang(91, "sn", "Shona", "Shona")
    val ARMENIAN = Lang(92, "hy", "Հայերեն", "Armenian")
    val IGBO = Lang(93, "ig", "Igbo", "Igbo")
    val ITALIAN = Lang(94, "it", "Italiano", "Italian")
    val YIDDISH = Lang(95, "yi", "ייִדיש", "Yiddish")
    val HINDI = Lang(96, "hi", "हिंदी", "Hindi")
    val SUNDANESE = Lang(97, "su", "Sunda", "Sundanese")
    val INDONESIAN = Lang(98, "id", "Indonesia", "Indonesian")
    val JAVANESE = Lang(99, "jw", "Wong Jawa", "Javanese")
    val ENGLISH = Lang(100, "en", "English", "English")
    val YORUBA = Lang(101, "yo", "Yorùbá", "Yoruba")
    val VIETNAMESE = Lang(102, "vi", "Tiếng Việt", "Vietnamese")
    val CHINESE_TRADITIONAL = Lang(103, "zh-TW", "正體中文", "Chinese Traditional")
    val CHINESE_SIMPLIFIED = Lang(104, "zh-CN", "简体中文", "Chinese Simplified")
    val ASSAMESE = Lang(105, "as", "Assamese", "Assamese")
    val DARI = Lang(106, "prs", "Dari", "Dari")
    val FIJIAN = Lang(107, "fj", "Fijian", "Fijian")
    val HMONG_DAW = Lang(108, "mww", "Hmong Daw", "Hmong Daw")
    val INUKTITUT = Lang(109, "iu", "ᐃᓄᒃᑎᑐᑦ", "Inuktitut")
    val KLINGON_LATIN = Lang(110, "tlh-Latn", "Klingon (Latin)", "Klingon (Latin)")
    val KLINGON_PIQAD = Lang(111, "tlh-Piqd", "Klingon (pIqaD)", "Klingon (pIqaD)")
    val ODIA = Lang(112, "or", "Odia", "Odia")
    val QUERETARO_OTOMI = Lang(113, "otq", "Querétaro Otomi", "Querétaro Otomi")
    val TAHITIAN = Lang(114, "ty", "Tahitian", "Tahitian")
    val TIGRINYA = Lang(115, "ti", "ትግርኛ", "Tigrinya")
    val TONGAN = Lang(116, "to", "lea fakatonga", "Tongan")
    val YUCATEC_MAYA = Lang(117, "yua", "Yucatec Maya", "Yucatec Maya")
    private var sLanguages: HashMap<Int, Lang> = HashMap()
    val languages: MutableList<Lang>
        get() = Collections.unmodifiableList(ArrayList(sLanguages.values)).toMutableList()

    init {
        sLanguages[0] = AUTO
        sLanguages[1] = ALBANIAN
        sLanguages[2] = ARABIC
        sLanguages[3] = AMHARIC
        sLanguages[4] = AZERBAIJANI
        sLanguages[5] = IRISH
        sLanguages[6] = ESTONIAN
        sLanguages[7] = BASQUE
        sLanguages[8] = BELARUSIAN
        sLanguages[9] = BULGARIAN
        sLanguages[10] = ICELANDIC
        sLanguages[11] = POLISH
        sLanguages[12] = BOSNIAN
        sLanguages[13] = PERSIAN
        sLanguages[14] = AFRIKAANS
        sLanguages[15] = DANISH
        sLanguages[16] = GERMAN
        sLanguages[17] = RUSSIAN
        sLanguages[18] = FRENCH
        sLanguages[19] = FILIPINO
        sLanguages[20] = FINNISH
        sLanguages[21] = FRISIAN
        sLanguages[22] = KHMER
        sLanguages[23] = GEORGIAN
        sLanguages[24] = GUJARATI
        sLanguages[25] = KAZAKH
        sLanguages[26] = HAITIAN_CREOLE
        sLanguages[27] = KOREAN
        sLanguages[28] = HAUSA
        sLanguages[29] = DUTCH
        sLanguages[30] = KYRGYZ
        sLanguages[31] = GALICIAN
        sLanguages[32] = CATALAN
        sLanguages[33] = CZECH
        sLanguages[34] = KANNADA
        sLanguages[35] = CORSICAN
        sLanguages[36] = CROATIAN
        sLanguages[37] = KURDISH
        sLanguages[38] = LATIN
        sLanguages[39] = LATVIAN
        sLanguages[40] = LAO
        sLanguages[41] = LITHUANIAN
        sLanguages[42] = LUXEMBOURGISH
        sLanguages[43] = ROMANIAN
        sLanguages[44] = MALAGASY
        sLanguages[45] = MALTESE
        sLanguages[46] = MARATHI
        sLanguages[47] = MALAYALAM
        sLanguages[48] = MALAY
        sLanguages[49] = MACEDONIAN
        sLanguages[50] = MAORI
        sLanguages[51] = MONGOLIAN
        sLanguages[52] = BANGLA
        sLanguages[53] = BURMESE
        sLanguages[54] = HMONG
        sLanguages[55] = XHOSA
        sLanguages[56] = ZULU
        sLanguages[57] = NEPALI
        sLanguages[58] = NORWEGIAN
        sLanguages[59] = PUNJABI
        sLanguages[60] = PORTUGUESE
        sLanguages[61] = PASHTO
        sLanguages[62] = CHICHEWA
        sLanguages[63] = JAPANESE
        sLanguages[64] = SWEDISH
        sLanguages[65] = SAMOAN
        sLanguages[66] = SERBIAN
        sLanguages[67] = SOTHO
        sLanguages[68] = SINHALA
        sLanguages[69] = ESPERANTO
        sLanguages[70] = SLOVAK
        sLanguages[71] = SLOVENIAN
        sLanguages[72] = SWAHILI
        sLanguages[73] = SCOTTISH_GAELIC
        sLanguages[74] = CEBUANO
        sLanguages[75] = SOMALI
        sLanguages[76] = TAJIK
        sLanguages[77] = TELUGU
        sLanguages[78] = TAMIL
        sLanguages[79] = THAI
        sLanguages[80] = TURKISH
        sLanguages[81] = WELSH
        sLanguages[82] = URDU
        sLanguages[83] = UKRAINIAN
        sLanguages[84] = UZBEK
        sLanguages[85] = SPANISH
        sLanguages[86] = HEBREW
        sLanguages[87] = GREEK
        sLanguages[88] = HAWAIIAN
        sLanguages[89] = SINDHI
        sLanguages[90] = HUNGARIAN
        sLanguages[91] = SHONA
        sLanguages[92] = ARMENIAN
        sLanguages[93] = IGBO
        sLanguages[94] = ITALIAN
        sLanguages[95] = YIDDISH
        sLanguages[96] = HINDI
        sLanguages[97] = SUNDANESE
        sLanguages[98] = INDONESIAN
        sLanguages[99] = JAVANESE
        sLanguages[100] = ENGLISH
        sLanguages[101] = YORUBA
        sLanguages[102] = VIETNAMESE
        sLanguages[103] = CHINESE_TRADITIONAL
        sLanguages[104] = CHINESE_SIMPLIFIED
        sLanguages[105] = ASSAMESE
        sLanguages[106] = DARI
        sLanguages[107] = FIJIAN
        sLanguages[108] = HMONG_DAW
        sLanguages[109] = INUKTITUT
        sLanguages[110] = KLINGON_LATIN
        sLanguages[111] = KLINGON_PIQAD
        sLanguages[112] = ODIA
        sLanguages[113] = QUERETARO_OTOMI
        sLanguages[114] = TAHITIAN
        sLanguages[115] = TIGRINYA
        sLanguages[116] = TONGAN
        sLanguages[117] = YUCATEC_MAYA
    }

    fun getValuesDirectoryName(lang: Lang): String? {
        val suffix: String = when {
            lang == CHINESE_SIMPLIFIED -> {
                "zh-rCN"
            }
            lang == CHINESE_TRADITIONAL -> {
                "zh-rTW"
            }
            lang == FILIPINO -> {
                "fil"
            }
            lang == INDONESIAN -> {
                "in-rID"
            }
            lang == JAVANESE -> {
                "jv"
            }
            else -> {
                lang.code
            }
        }
        return "values-$suffix"
    }

}