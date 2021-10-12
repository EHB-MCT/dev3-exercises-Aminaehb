fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val computerChoice = options.random()
    val userChoice =

    println("Computer picked $computerChoice")
    println("User picked $userChoice")
    determineWinner(computerChoice, userChoice)
}

fun getUserChoice(options: Array<String>): String? {
    var userChoice: String?
    do {
        println("Make your choice: rock - paper scissors")
        userChoice = redLine()
    } while (!options.contains(userChoice))
    return userChoice
}

fun determineWinner(computerChoice: String userChoice: String) {
    if (computerChoice == userChoice){
        println("It's a draw")
        return
    }
    val winMessage = "You have won!"
    val loseMessage = "You have lost"

    when (computerChoice) {
        "rock" -> if (userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if (userChoice == "scissors") println(winMessage) else println(loseMessage)
        "scissors" -> (userChoice == "rock") println (winMessage) else println(loseMessage)
    }
}