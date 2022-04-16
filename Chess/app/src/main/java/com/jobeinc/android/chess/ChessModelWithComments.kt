package com.jobeinc.android.chess

// Overriding the toString() of Class Any to print out the "Empty Chess Board"

// This class is for our Game Model
class ChessModelWithComments {

    override fun toString(): String {
        // leave only 1 space before \n
        var chessBoard = " \n"

//      for (row in 7 downTo 0) {
//            chessBoard += "$row"
        for (row in 0..7) {
//            val rowDesc = 7 - row
//            chessBoard += "$rowDesc"
            chessBoard += "${7 - row}"

            for (column in 0..7) {
                chessBoard += " ."
            }
            // for "row" we need to do line break
            chessBoard += "\n"
        }
//        Add label for horizontal (LTR)
        chessBoard += "  0 1 2 3 4 5 6 7"

//        Add label for Vertical (BTT)

        return chessBoard
    }

}