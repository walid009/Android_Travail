package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class MyCareer : AppCompatActivity() {
    private lateinit var btnExperience: Button
    private lateinit var btnEducation: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_career)

        val toolbar: Toolbar = findViewById(R.id.app_bar)
        setSupportActionBar(toolbar)

        btnEducation = findViewById(R.id.buttonEducation)
        btnEducation!!.setOnClickListener {
            changeFragment(EducationBlankFragment(), "")
        }
        btnExperience = findViewById(R.id.buttonExperience)
        btnExperience!!.setOnClickListener {
            changeFragment(ExperienceBlankFragment(), "")
        }
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, EducationBlankFragment()).commit()
    }
    private fun changeFragment(fragment: Fragment, name: String) {

        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(name).commit()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menulist, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_exp -> {
                val intent= Intent(this, AddExperienceActivity::class.java)
                startActivity(intent)
            }
            R.id.action_edu -> Toast.makeText(this,"education selected", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}