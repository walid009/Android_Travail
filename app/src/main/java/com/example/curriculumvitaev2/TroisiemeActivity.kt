package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class TroisiemeActivity : AppCompatActivity() {


    private lateinit var btnSkills: Button
    private lateinit var btnHobbies: Button
    private lateinit var btnLanguages: Button
    private var textViewName: TextView? = null
    private var textViewEmail: TextView? = null
    private lateinit var btnMyCarrer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_troisieme)

        val toolbar: Toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)

        title = "Your Resume  "

        textViewName = findViewById(R.id.textViewNom)
        textViewEmail = findViewById(R.id.textViewAddress)

        textViewName!!.setText(intent.getStringExtra("Name").toString())
        textViewEmail!!.setText(intent.getStringExtra("Email").toString())


        btnSkills = findViewById(R.id.btnSkills)

        btnSkills!!.setOnClickListener {
            changeFragment(SkillFragment(), "")
        }

        btnHobbies = findViewById(R.id.btnHobbies)

        btnHobbies!!.setOnClickListener {
            changeFragment(HobbiesFragment(), "")
        }

        btnLanguages = findViewById(R.id.btnLanguage)

        btnLanguages!!.setOnClickListener {
            changeFragment(LanguageFragment(), "")
        }

        supportFragmentManager.beginTransaction().add(R.id.fragment_container, SkillFragment()).commit()

        btnMyCarrer = findViewById(R.id.buttonCarrer)
        btnMyCarrer.setOnClickListener {
            val intent= Intent(this, MyCareer::class.java)
            startActivity(intent)
        }
    }
    private fun changeFragment(fragment: Fragment, name: String) {

        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(name).commit()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_info -> Toast.makeText(this,"education selected", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}