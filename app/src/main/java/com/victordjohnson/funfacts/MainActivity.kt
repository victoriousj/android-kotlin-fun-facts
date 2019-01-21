package com.victordjohnson.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*



class MainActivity : AppCompatActivity() {

  private var factTextView: TextView? = null
  private var showFactButton: Button? = null
  private var relativeLayout: RelativeLayout? = null
  private val factBook = FactBook()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    factTextView = findViewById(R.id.funFactTextView)
    showFactButton = findViewById(R.id.showFactButton)
    relativeLayout = findViewById(R.id.relativeLayout)

    showFactButton!!.setOnClickListener {
      factTextView!!.text = factBook.getFact()
    }
  }
}
