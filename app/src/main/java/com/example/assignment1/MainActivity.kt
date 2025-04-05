package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
        val button2 = findViewById<Button>(R.id.button2)
        val editName =findViewById<EditText>(R.id.editName)
        val textDisplay =findViewById<TextView>(R.id.textDisplay)

        clickMeButton?.setOnClickListener {

            Toast.makeText(this@MainActivity , "button Clicked" , Toast.LENGTH_SHORT).show()

            val time = editName.text.toString()

            if(time == "morning"){
                textDisplay.text = "Scrambled Eggs With Whole Wheat Toast and Avocado"
            }else if (time=="mid_morning"){
                textDisplay.text = "Protein Smoothie"
            }else if (time == "afternoon"){
                textDisplay.text = "Grilled Checken with Brown Rice and Steamed Vegies"
            }else if (time == "mid-afternoon"){
                textDisplay.text = "Salad"
            }else if (time == "Dinner"){
                textDisplay.text = "Beef Stir_fry with Vegitables and Jasmine Rice"
            }
            else{
                textDisplay.text= "No Options found< please try other times"
            }
        }

    }
}
