package tictactoe

import java.util.*


fun main() {
    //print("Enter cells:")

    var tt = "_________"// readLine()!!
  //  val tt = Scanner(System.`in`).next()
    val coordinates = arrayOf("11", "12", "13", "21", "22", "23", "31", "32", "33")


    println("---------")
    println("| ${tt[0]} ${tt[1]} ${tt[2]} |")
    println("| ${tt[3]} ${tt[4]} ${tt[5]} |")
    println("| ${tt[6]} ${tt[7]} ${tt[8]} |")
    println("---------")

    var turn = 1
    do {

        print("Enter the coordinates: ")

        var input = readLine()!!.replace("&gt;", "").replace(" ", "")


        while (checkEmpty(input, coordinates, tt) != true) {
            if (checkInput(input) != "") println(checkInput(input))
            else println("This cell is occupied! Choose another one!")
            print("Enter the coordinates: ")
            input = readLine()!!.replace("&gt;", "").replace(" ", "")
        }


        var newtt = ""

        for (i in tt.indices) {
            if (input == coordinates[i] && tt[i] == '_') {
                if (turn % 2 == 1) newtt += 'X'
                else newtt += 'O'
            }
            else newtt += tt[i]
        }

        println("---------")
        println("| ${newtt[0]} ${newtt[1]} ${newtt[2]} |")
        println("| ${newtt[3]} ${newtt[4]} ${newtt[5]} |")
        println("| ${newtt[6]} ${newtt[7]} ${newtt[8]} |")
        println("---------")

        tt = newtt
        turn++
    } while (checkState(newtt) == "Game not finished")

    println(checkState(tt))

//    println(checkState(tt))

}