fun main() {
    println("Pretty Little Liars riddle")
    challengeOne()
}

fun challengeOne() {
    println(
        "Little girls love me, little liars don't. I look like you. I have eyes, but I can't see." +
                "My skin never feels cold. I can't hear you when you scream. If you drop me, I will shatter." +
                "But you can't break my heart, because I don't have one. My rosy lips are sealed. What am I?"
    )
    val answer = setOf<String>("Doll")

    val response = readLine()
    if (answer.contains(response)) {
        //println("correctAnswer")
        challengeTwo()
    } else {
        println("gameOver")
    }

}

fun challengeTwo() {
    val diceResult = (1..6).random() //0..6 = 1 tot aan 6
    val response = readLine()

    if (response == "low" && (1..3).contains(diceResult)) {
        //win
    } else if (response == "high" && (4..6).contains(diceResult)) {
    //win
    }  else {
        //game over
}

}