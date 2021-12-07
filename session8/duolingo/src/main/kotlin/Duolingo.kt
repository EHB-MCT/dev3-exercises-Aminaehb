class Duolingo( val roundSize: Int = 5, val language: String = "English") { //Round size + language
    var words = mutableSetOf<Word>(
        FrenchWord("vache", "koe"),
        EnglishWord("elephant", "olifant"),
        FrenchWord("canard", "eend"),
        EnglishWord("salam", "hello")
    )

    init {  // verwijst naar class FrenchWord or EnglishWord
        // words.filter {it.language == language } //alle woorden filteren, maar het woord zelf wordt niet aangepast
        words = words.filter { it.language == language }.toMutableSet() // veranderen naar een var
        // it.language of het klopt met val language in constructor van class duolingo
    }

fun play() {
        val selectedWords = words.shuffled().take(roundSize).toMutableSet() //= maakt het aanpasbaar (mutableset)
    // change 5 to roundsize it will take the dynamic round size into account
       while (selectedWords.count() > 0) {  //while er zolang er nog woorden zijn
   //while (selectedWords.isNotEmpty()) { //blijven vragen tot het goede antwoord komt
       val selectedWord = selectedWords.random()
       println(selectedWord.original)
       val userAnswer = readLine()
       if (userAnswer == selectedWord.translated) {
           //good
           selectedWords.remove(selectedWord)
       } else {
           //bad
           println(selectedWord.translated)
       }
       println("Good job, you translated all the words")
       println(selectedWords.count()) //hoeveel woorden er nog overblijven
   }
}
}









