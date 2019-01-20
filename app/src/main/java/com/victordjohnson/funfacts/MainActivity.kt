package com.victordjohnson.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)

      val rand = Random()

      val btn = findViewById<Button>(R.id.showFactButton)

      btn.setOnClickListener {
        val text = findViewById<TextView>(R.id.funFactTextView)
        val num = rand.nextInt().toString()
        text.text = num
      }
    }
}
