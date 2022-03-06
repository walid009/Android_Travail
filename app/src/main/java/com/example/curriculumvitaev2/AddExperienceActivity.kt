package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.curriculumvitaev2.data.Experience
import com.example.curriculumvitaev2.utils.AppDataBase

class AddExperienceActivity : AppCompatActivity() {
    private lateinit var btnSave: Button
    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editDate1: EditText
    private lateinit var editDate2: EditText

    lateinit var appDataBase: AppDataBase

    lateinit var champList : MutableList<Experience>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_experience)

        //TODO 10 "Initialize the database var"
        appDataBase = AppDataBase.getDatabase(this)

        editName = findViewById(R.id.EditTextName)
        editEmail = findViewById(R.id.EditTextAddress)
        editDate1 = findViewById(R.id.EditTextDate1)
        editDate2 = findViewById(R.id.EditTextDate2)
        btnSave = findViewById(R.id.buttonSaveExp)

        btnSave!!.setOnClickListener {
            var exp =
                com.example.curriculumvitaev2.data.Experience( id = 2,expPic = R.drawable.ic_logo_amazon ,expName = editName.text.toString(),expAddress = editEmail.text.toString(),expD1 = editDate1.text.toString(),expD2 = editDate2.text.toString())
            try {
            appDataBase.experienceDao().insert(exp!!)
                champList = appDataBase.experienceDao().getAll()
                println(champList)

            }catch (ex: Exception){
                Toast.makeText(this, "Could not add the champion !",Toast.LENGTH_SHORT).show()
            }
            val intent= Intent(this, MyCareer::class.java)
            startActivity(intent)
        }

    }
}