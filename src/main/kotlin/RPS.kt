fun gameLogic(){

    println("Please enter the letter of choice: ")
    val userInput: String = readln()
    val option: String = userInput.uppercase()

    val cplayerChoice = arrayOf("R","S","P").random()


    when (option){

        "R","S","P" -> println(results(option,cplayerChoice))
        else -> print("you made some invalid Input")
    }
}

fun score(tie:Int,User:Int,Computer:Int){

    var ScoreSheet = "Ties = $tie , Wins = $User , losses = $Computer"

    return println(ScoreSheet)
}





fun results(data: String, choice: String): String {

    var tie:Int = 0
    var user:Int = 0
    var computer:Int = 0

    if (data == choice){
        print("You have a tie now oof")

        tie += 1
    }

    var final:String

    if ((data == "P" && choice == "S")){
        final = "Computer won"
        computer += 1
    }

    else{
        final = "You won"
        user +=1
    }

    if ((data == "S" && choice == "R")){
        final = "Computer won"
        computer += 1

    }

    else{

        final = "You won"
        user += 1

    }

    if ((data == "R" && choice == "P")){

        final = "Computer won"
        computer += 1

    }

    else{

        final = "You won"
        user += 1

    }

    score(tie,user,computer)
    return final
}


fun main(){
    println("Welcome to the game my dudessss")

    println("How many rounds do you want to play?")
    var round:String = readln()
    var rounds = round.toInt()

    for(i in 1..rounds){
        gameLogic()
    }
    score()
}

//Error in the Score displaying