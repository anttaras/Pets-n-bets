package tictactoe

fun checkEmpty(cd: String, coordinates: Array<String>, tt: String): Boolean {
    var result = false
    for (i in tt.indices) {
        if (cd == coordinates[i] && tt[i] == '_') result = true
    }
    return result
}