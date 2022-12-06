fun gameLogic(){

    println("Please enter the letter of choice: ")
    val userInput: String = readln()
    val option: String = userInput.uppercase()
    println("Your choice: $userInput")
    val cplayerChoice = arrayOf("R","S","P").random()
    println("Computer picked: $cplayerChoice")
    println("This is your choice: $option and this is the Computers choice: $cplayerChoice")


    when (option){

        "R","S","P" -> println(results(option,cplayerChoice))
        else -> print("you made some invalid Input")
    }
}




fun results(data: String, choice: String){

    var tie:Int = 0
    var user:Int = 0
    var computer:Int = 0

    var final: String = ""

    //while (i = rounds)

    if (data == "R"){
        if(choice == "P"){
            final = "Computer wins"
            losses += 1
        }
        else {final = "You won"
            wins += 1 }
    }

    else if(data == "P"){
        if(choice == "S"){
            final = "Computer wins"
            losses += 1
        }
        else { final = "You won"
            wins += 1 }
    }

    else if(data == "S"){
        if(choice == "R"){
            final = "Computer wins"
            losses += 1
        }
        else { final = "You won"
            wins += 1 }
    }

    println(final)
    println("wins: $wins , ties:  $ties, loss:  $losses")
}

fun main(){
    println("Welcome to the game my dudessss")

    println("How many rounds do you want to play?")
    val round:String = readln()
    val rounds = round.toInt()

    for(i in 1..rounds){
        gameLogic()
    }

}