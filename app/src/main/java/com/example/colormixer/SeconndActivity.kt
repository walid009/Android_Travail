package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SeconndActivity : AppCompatActivity() {

    private var textViewChoseColor: TextView? = null
    private var buttonSubmit: Button? = null
    private var radioButtonPurpule: RadioButton? = null
    private var radioButtonGreen: RadioButton? = null
    private var radioButtonOrange: RadioButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconnd)

        title = "Choose your answer"

        textViewChoseColor = findViewById(R.id.textViewChoseColor);
        textViewChoseColor!!.setText("You Choosed "+intent.getStringExtra("Name").toString())

        radioButtonPurpule = findViewById(R.id.radioButtonPurpule)
        radioButtonGreen = findViewById(R.id.radioButtonGreen)
        radioButtonOrange = findViewById(R.id.radioButtonOrange)

        buttonSubmit = findViewById(R.id.buttonSubmit)
        buttonSubmit!!.setOnClickListener{
            if(radioButtonPurpule!!.isChecked == false && radioButtonGreen!!.isChecked == false && radioButtonOrange!!.isChecked == false){
                Toast.makeText(applicationContext,"you need checkec one color",Toast.LENGTH_LONG).show()
            }else if(radioButtonGreen!!.isChecked ){
                val intent= Intent(this, ThirdActivity2::class.java)
                startActivity(intent)
            }else{
                val intent= Intent(this, FourActivity::class.java)
                startActivity(intent)
            }
        }

    }
}