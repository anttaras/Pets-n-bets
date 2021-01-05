package tictactoe

fun checkInput(input: String): String {
    var returnText = ""

    if (input.length != 2) returnText = "Error!"
    else {
        for (ch in input) {
            if (!ch.isDigit()) {
                returnText = "You should enter numbers!"
            } else if (ch.toString().toInt() !in 1..3) {
                returnText = "Coordinates should be from 1 to 3!"
            }
        }
    }


    return returnText
}