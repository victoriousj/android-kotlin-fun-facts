package com.victordjohnson.funfacts

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import java.lang.Character.getName


class MainActivity : AppCompatActivity() {

  private val TAG = MainActivity::class.java.simpleName
  private val factBook = FactBook()
  private val colorWheel = ColorWheel()

  private var factTextView: TextView? = null
  private var showFactButton: Button? = null
  private var relativeLayout: RelativeLayout? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    factTextView = findViewById(R.id.funFactTextView)
    showFactButton = findViewById(R.id.showFactButton)
    relativeLayout = findViewById(R.id.relativeLayout)

    showFactButton!!.setOnClickListener {
      factTextView!!.text = factBook.getFact()

      val newColor = colorWheel.getColor()
      relativeLayout!!.setBackgroundColor(newColor)
      showFactButton!!.setTextColor(newColor)

      Log.d(TAG, "click" )
    }
  }
}
