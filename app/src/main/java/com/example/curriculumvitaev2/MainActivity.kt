package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.curriculumvitaev2.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private var radioButtonMale: RadioButton? = null
    private var radioButtonFemale: RadioButton? = null
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        radioButtonMale = findViewById(R.id.radioButtonMale)
        radioButtonFemale = findViewById(R.id.radioButtonFemale)

        setupTextInputLayout()
        title = "Create your Resume"
    }
    private fun setupTextInputLayout() {
        binding.buttonNext.setOnClickListener {
            val fullname = binding.EditTextFullName.text.toString()
            val email = binding.EditTextEmail.text.toString()
            val age = binding.EditTextAge.text.toString()

            val intent= Intent(this, TroisiemeActivity::class.java)
            if(radioButtonMale!!.isChecked){
                intent.putExtra("Genre","Male")
            }
            if(radioButtonFemale!!.isChecked){
                intent.putExtra("Genre","Female")
            }
            intent.putExtra("Name","Name: $fullname")
            intent.putExtra("Email","Email : $email")
            intent.putExtra("Age","Age : $age")

            startActivity(intent)
        }
    }

}