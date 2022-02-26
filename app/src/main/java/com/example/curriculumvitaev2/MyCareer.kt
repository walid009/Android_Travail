package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MyCareer : AppCompatActivity() {
    private lateinit var btnExperience: Button
    private lateinit var btnEducation: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_career)

        btnEducation = findViewById(R.id.buttonEducation)
        btnEducation!!.setOnClickListener {
            changeFragment(EducationBlankFragment(), "")
        }
        btnExperience = findViewById(R.id.buttonExperience)
        btnExperience!!.setOnClickListener {
            changeFragment(ExperienceBlankFragment(), "")
        }
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, ExperienceBlankFragment()).commit()
    }
    private fun changeFragment(fragment: Fragment, name: String) {

        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(name).commit()

    }
}