package com.jobeinc.android.chess

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val LOG_TAG = "MainActivity"

class MainActivityWithComments : AppCompatActivity() {

//    initialize ChessModel Class
    var chessModel = ChessModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // without StringTemplate
        Log.d(LOG_TAG, chessModel.toString())
        // with StringTemplate
        Log.d(LOG_TAG, "$chessModel")


    }
}



//       Log.d(LOG_TAG, "Hello Game!")
//        for (i in 0..8) {
//            if (i % 2 == 0) {
//                Log.d(LOG_TAG, "i = $i")
//            }
//        }