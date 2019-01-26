package com.victordjohnson.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

  private val TAG = MainActivity::class.java.simpleName
  private val factBook = FactBook()
  private val colorWheel = ColorWheel()


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    showFactButton.setOnClickListener{
      funFactTextView.text = factBook.getFact()

      val newColor = colorWheel.getColor()
      relativeLayout.setBackgroundColor(newColor)
      showFactButton.setTextColor(newColor)

      Log.d(TAG, "click" )
    }
  }
}
