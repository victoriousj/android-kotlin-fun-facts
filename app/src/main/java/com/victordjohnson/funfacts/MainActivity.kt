package com.victordjohnson.funfacts

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)

      val rand = Random()

      var btn = findViewById<Button>(R.id.hello)
      btn.setOnClickListener {toast(rand.nextInt().toString())}
    }
  private fun Context.toast(message: CharSequence)=
      Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
