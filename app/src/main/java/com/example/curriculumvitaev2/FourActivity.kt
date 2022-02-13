package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FourActivity : AppCompatActivity() {
    private var textViewName: TextView? = null
    private var textViewEmail: TextView? = null
    private var textViewAge: TextView? = null
    private var textViewGender: TextView? = null
    private var textViewAndroid: TextView? = null
    private var textViewIOS: TextView? = null
    private var textViewFlutter: TextView? = null
    private var textViewLanguages: TextView? = null
    private var textViewHobbies: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        textViewName = findViewById(R.id.textViewName)
        textViewEmail = findViewById(R.id.textViewEmail)
        textViewAge = findViewById(R.id.textViewAge)
        textViewGender = findViewById(R.id.textViewGender)
        textViewAndroid = findViewById(R.id.textViewAndroid)
        textViewIOS = findViewById(R.id.textViewIOS)
        textViewFlutter = findViewById(R.id.textViewFlutter)
        textViewLanguages = findViewById(R.id.textViewLanguages)
        textViewHobbies = findViewById(R.id.textViewHobbies)

        textViewName!!.setText(intent.getStringExtra("Name").toString())
        textViewEmail!!.setText(intent.getStringExtra("Email").toString())
        textViewAge!!.setText(intent.getStringExtra("Age").toString())
        textViewGender!!.setText(intent.getStringExtra("Gender").toString())
        textViewAndroid!!.setText(intent.getStringExtra("Android").toString())
        textViewIOS!!.setText(intent.getStringExtra("IOS").toString())
        textViewFlutter!!.setText(intent.getStringExtra("Flutter").toString())
        textViewLanguages!!.setText(intent.getStringExtra("Languages").toString())
        textViewHobbies!!.setText(intent.getStringExtra("Hobbies").toString())
    }
}