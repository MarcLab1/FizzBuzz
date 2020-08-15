package com.fizzbuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView1: TextView = this.findViewById(R.id.textView1)
        var output: StringBuilder = StringBuilder()
        var isFizzOrBuzz: Boolean = false
        for (i in 1..100) {
            if (i % 3 == 0) {
                output.append("fizz")
                isFizzOrBuzz = true
            }
            if (i % 5 == 0) {
                output.append("buzz")
                isFizzOrBuzz = true
            }

            if(isFizzOrBuzz) {
                output.append("\n")
                isFizzOrBuzz = false
            }
            else {
                output.append(i.toString()).append("\n")
            }
        }
        textView1.setText(output)
    }
}