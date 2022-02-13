package com.example.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourActivity : AppCompatActivity() {

    private var buttonQuit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        buttonQuit = findViewById(R.id.buttonquit2)
        buttonQuit!!.setOnClickListener{
            finish()
        }
    }
}