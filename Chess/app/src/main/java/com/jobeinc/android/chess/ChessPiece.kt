package com.jobeinc.android.chess

data class ChessPiece(val column: Int,
                      val row: Int,
                      val player: ChessPlayer,
                      val rank: ChessRank) {
}