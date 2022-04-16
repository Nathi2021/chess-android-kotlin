package com.jobeinc.android.chess

class ChessModel {

    override fun toString(): String {
        var chessBoard = " \n"

//       for (row in 0..7) {
//          chessBoard += "${7 - row}"
        for (row in 7 downTo 0) {
            chessBoard += "$row"

            for (column in 0..7) {
                chessBoard += " ."
            }
            chessBoard += "\n"
        }
        chessBoard += "  0 1 2 3 4 5 6 7"

        return chessBoard
    }
}