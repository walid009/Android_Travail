package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    private var buttonMix: Button? = null
    private var checkBoxBleu: CheckBox? = null
    private var checkBoxRed: CheckBox? = null
    private var checkBoxYellow: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonMix = findViewById(R.id.buttonMix)
        checkBoxBleu = findViewById(R.id.checkBoxBleu)
        checkBoxRed = findViewById(R.id.checkBoxRed)
        checkBoxYellow = findViewById(R.id.checkBoxYellow)

        buttonMix!!.setOnClickListener{
            val intent= Intent(this, SeconndActivity::class.java)
            if( checkBoxBleu!!.isChecked && checkBoxRed!!.isChecked){
                intent.putExtra("Name","BLEU and RED")
            }else
            if( checkBoxBleu!!.isChecked &&  checkBoxYellow!!.isChecked){
                intent.putExtra("Name","BLEU and Yellow")
            }else
            if( checkBoxRed!!.isChecked && checkBoxYellow!!.isChecked ){
                intent.putExtra("Name","RED abd YELLOW")
            }
            startActivity(intent)
        }
    }

}