
var wins:Int = 0
var ties:Int = 0
var losses:Int = 0




fun main() {
    println("Enter letter 1: ")
    val p1:String = readln().uppercase()
    println(p1)
    println("Enter letter 2: ")
    val p2:String = readln().uppercase()
    println(p2)

    if (p1 == "R"){
        if(p2 == "P"){
            print("Computer wins")
            losses += 1
        }
        else { print("You won")
            wins += 1 }
        }

    else if(p1 == "P"){
        if(p2 == "S"){
            print("Computer wins")
            losses += 1
        }
        else { print("You won")
            wins += 1 }
    }

    else if(p1 == "S"){
        if(p2 == "R"){
            print("Computer wins")
            losses += 1
        }
        else { print("You won")
            wins += 1 }
    }


    println("$wins $ties $losses")
}