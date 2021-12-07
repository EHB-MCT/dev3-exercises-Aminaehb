class EnglishWord(override val original: String, override val translated: String, )
    : Word(original, translated, "English") { //naar de constructor van Word stuur je dit door
}