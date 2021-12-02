package com.example.english_alpha_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var alphabetTextView : TextView = findViewById(R.id.alphabet_text_view)
        val startButton : Button = findViewById(R.id.start_button)

        startButton.setOnClickListener {
            var a : String = "Алфавит: "
                for (i in 'a'..'z'){
                    if (i.code % 2 == 0) {
                        a = a + i.toString() + " "
                   }
                }
            alphabetTextView.text = a
        }

    }
}