fun main() {
    println("Pretty Little Liars riddle")
    challengeOne()
}

fun challengeOne() {
    println("Little girls love me, little liars don't. I look like you. I have eyes, but I can't see.")
    println("My skin never feels cold. I can't hear you when you scream. If you drop me, I will shatter.")
    println("But you can't break my heart, because I don't have one. My rosy lips are sealed.")
    println("What am I?")
    val answer = setOf<String>("Doll")

    val response = readLine()
    if (answer.contains(response)) {
        println("correct answer")
        challengeTwo()
    } else {
        println("game over")
    }

}

fun challengeTwo() {
    println("Now role the dice to see how lucky you are?")
    println("Write low if you think it's between 1 & 3" )
    println("Write high if you think it's between 4 & 6" )
    val diceResult = (1..6).random() //0..6 = 1 tot aan 6
    val response = readLine()

    if (response == "low" && (1..3).contains(diceResult)) {
        println("correct answer")
        challengeThree()
    } else if (response == "high" && (4..6).contains(diceResult)) {
        challengeThree()
    }  else {
        println("game over")
}
}

fun challengeThree() {
    println("Now you and your best friends are in the room alone with A & A is trying to kill you guys. ")
    println("What would you use to protect yourself and your friends?")
    val userWeapon = setOf<String>("knife")
    val response = readLine()
    if (userWeapon.contains(response)){
    println("correct answer")
        challengeFour()
    } else if (userWeapon.contains(response)) {
    println("flee")
        challengeTwo()
    } else {
        println("game over")
    }
}

fun challengeFour() {

}

