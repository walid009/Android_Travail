package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import android.view.Menu
import android.view.MenuItem
import android.view.textservice.SpellCheckerInfo
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class TroisiemeActivity : AppCompatActivity() {
    private var buttonSubmit: Button? = null
    private var seekBarAndroid: SeekBar? = null
    private var seekBarIOS: SeekBar? = null
    private var seekBarFlutter: SeekBar? = null
    private var checkBoxArabic: CheckBox? = null
    private var checkBoxFrench: CheckBox? = null
    private var checkBoxEnglish: CheckBox? = null
    private var checkBoxMusic: CheckBox? = null
    private var checkBoxSport: CheckBox? = null
    private var checkBoxGames: CheckBox? = null

    private lateinit var btnSkills: Button
    private lateinit var btnHobbies: Button
    private lateinit var btnLanguages: Button
    private var textViewName: TextView? = null
    private var textViewEmail: TextView? = null
    private lateinit var btnMyCarrer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_troisieme)

        title = "Your Resume  "

        /*seekBarAndroid = findViewById(R.id.seekBarAndroid)
        seekBarIOS = findViewById(R.id.seekBarIOS)

        seekBarFlutter = findViewById(R.id.seekBarFlutter)
        seekBarAndroid = findViewById(R.id.seekBarAndroid)
        seekBarIOS = findViewById(R.id.seekBarIOS)

        checkBoxArabic = findViewById(R.id.checkBoxArabic)
        checkBoxFrench = findViewById(R.id.checkBoxFrench)
        checkBoxEnglish = findViewById(R.id.checkBoxEnglish)

        checkBoxMusic = findViewById(R.id.checkBoxMusic)
        checkBoxSport = findViewById(R.id.checkBoxSport)
        checkBoxGames = findViewById(R.id.checkBoxGames)

        var checkGroup1 = "Languages :"
        var checkGroup2 = "Hobbies : "

        buttonSubmit = findViewById(R.id.buttonSubmit)

        buttonSubmit!!.setOnClickListener {

            if(checkBoxArabic!!.isChecked){
                checkGroup1+= " Arabic"
            }
            if(checkBoxFrench!!.isChecked){
                checkGroup1+= " French"
            }
            if(checkBoxEnglish!!.isChecked){
                checkGroup1+= " English"
            }

            if(checkBoxMusic!!.isChecked){
                checkGroup2+= " Music"
            }
            if(checkBoxSport!!.isChecked){
                checkGroup2+= " Sport"
            }
            if(checkBoxGames!!.isChecked){
                checkGroup2+= " Games"
            }
            val intent2= Intent(this, FourActivity::class.java)

            intent2.putExtra("Name",intent.getStringExtra("Name").toString())
            intent2.putExtra("Email",intent.getStringExtra("Email").toString())
            intent2.putExtra("Age",intent.getStringExtra("Age").toString())
            intent2.putExtra("Gender","Gender :"+ intent.getStringExtra("Genre").toString())
            intent2.putExtra("IOS","IOSSkill : "+seekBarIOS!!.getProgress())
            intent2.putExtra("Flutter","FlutterSkill : "+seekBarFlutter!!.getProgress())
            intent2.putExtra("Android","AndroidSkill : "+seekBarAndroid!!.getProgress())
            intent2.putExtra("Languages",checkGroup1)
            intent2.putExtra("Hobbies",checkGroup2)
            startActivity(intent2)

            checkGroup1 = "Languages :"
            checkGroup2 = "Hobbies : "*/

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
}