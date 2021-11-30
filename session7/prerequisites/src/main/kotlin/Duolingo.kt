class Duolingo {
    val words = mutableSetOf<Word> (
        Word("vache", "koe","Frecnh"),
        Word("elephant", "olifant", "English"),
        Word("canard", "eend", "French"),
        Word("salam", "hallo", "Arabic")
    )
    fun play() {
        val selectedWords =  words.shuffled().take(5).toMutableSet() //= maakt het aanpasbaar (mutableset)

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
       println("Good job")
       println(selectedWords.count()) //hoeveel woorden er nog overblijven
   } }

}
