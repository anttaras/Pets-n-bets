package tictactoe
import java.lang.Math.abs

fun checkState(tictac: String): String {
    var state = ""
    var winXcount = 0
    var winOcount = 0
    var xs = 0
    var os = 0

    for (sell in tictac) {
        if (sell == 'X') xs++
        if (sell == 'O') os++

    }

    if (Math.abs(xs - os) >= 2) state = "Impossible"

    if (state != "Impossible") {

        for (i in 0..8 step 3) {
            if (tictac[i] == tictac[i + 1] && tictac[i + 1] == tictac[i + 2]) {

                if (tictac[i] == 'X') {
                    winXcount++
                    state = "X wins"
                } else if (tictac[i] == 'O') {
                    winOcount++
                    state = "O wins"
                }
            }
        }

        for (i in 0..2 step 1) {
            if (tictac[i] == tictac[i + 3] && tictac[i + 3] == tictac[i + 6]) {
                if (tictac[i] == 'X') {
                    winXcount++
                    state = "X wins"
                } else if (tictac[i] == 'O') {
                    winOcount++
                    state = "O wins"
                }
            }
        }


        if (tictac[0] == tictac[4] && tictac[4] == tictac[8]) {
            if (tictac[0] == 'X') {
                winXcount++
                state = "X wins"
            } else if (tictac[0] == 'O') {
                winOcount++
                state = "O wins"
            }
        }

        if (tictac[2] == tictac[4] && tictac[4] == tictac[6]) {
            if (tictac[2] == 'X') {
                winXcount++
                state = "X wins"
            } else if (tictac[2] == 'O') {
                winOcount++
                state = "O wins"
            }
        }


        if (winXcount >= 1 && winOcount >= 1) state = "Impossible"
        else if (winXcount == 0 && winOcount == 0) {
            state = "Draw"
            for (sell in tictac) {

                if (sell == '_') {
                    state = "Game not finished"
                }
            }
        }


    }
    return state
}
