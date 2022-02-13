package com.example.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity2 : AppCompatActivity() {

    private var buttonQuit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third2)

        buttonQuit = findViewById(R.id.button1quit)
        buttonQuit!!.setOnClickListener{
            finish()
        }
    }
}