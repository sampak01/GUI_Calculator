package com.example.guicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentTotal = 0.0
        var currentOp = 0

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button0)

        val add_button = findViewById<Button>(R.id.add_button)
        val sub_button = findViewById<Button>(R.id.subtract_button)
        val mult_button = findViewById<Button>(R.id.multiply_button)
        val div_button = findViewById<Button>(R.id.divide_button)
        val sqrt_button = findViewById<Button>(R.id.sqrt_button)
        val dot_button = findViewById<Button>(R.id.dot_button)
        val eql_button = findViewById<Button>(R.id.equals_button)

        val num_display = findViewById<TextView>(R.id.num_display)

        button1.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "1"
            }else{
                num_display.text = num_display.text.toString().plus("1")
            }
        }
        button2.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "2"
            }else{
                num_display.text = num_display.text.toString().plus("2")
            }
        }
        button3.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "3"
            }else{
                num_display.text = num_display.text.toString().plus("3")
            }
        }
        button4.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "4"
            }else{
                num_display.text = num_display.text.toString().plus("4")
            }
        }
        button5.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "5"
            }else{
                num_display.text = num_display.text.toString().plus("5")
            }
        }
        button6.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "6"
            }else{
                num_display.text = num_display.text.toString().plus("6")
            }
        }
        button7.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "7"
            }else{
                num_display.text = num_display.text.toString().plus("7")
            }
        }
        button8.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "8"
            }else{
                num_display.text = num_display.text.toString().plus("8")
            }
        }
        button9.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "9"
            }else{
                num_display.text = num_display.text.toString().plus("9")
            }
        }
        button0.setOnClickListener{
            if(num_display.text.equals("0")){
                num_display.text = "0"
            }else{
                num_display.text = num_display.text.toString().plus("0")
            }
        }
        dot_button.setOnClickListener{
            if(num_display.text.contains('.')){

            }else{
                num_display.text = num_display.text.toString().plus(".")
            }
        }


        add_button.setOnClickListener{
            currentTotal = num_display.text.toString().toDouble()
            currentOp = 0
            num_display.text = "0"
        }
        sub_button.setOnClickListener{
            currentTotal = num_display.text.toString().toDouble()
            currentOp = 1
            num_display.text = "0"
        }
        mult_button.setOnClickListener{
            currentTotal = num_display.text.toString().toDouble()
            currentOp = 2
            num_display.text = "0"
        }
        div_button.setOnClickListener{
            currentTotal = num_display.text.toString().toDouble()
            currentOp = 3
            num_display.text = "0"
        }
        sqrt_button.setOnClickListener{view: View ->
            if(num_display.text.toString().toDouble()<0){
                Snackbar.make(view,"Can't Square Root Negative Number",5).show()
            }else{
                num_display.text = sqrt(num_display.text.toString().toDouble()).toString()
            }
        }

        eql_button.setOnClickListener{
            when(currentOp){
                0 -> num_display.text = (currentTotal + num_display.text.toString().toDouble()).toString()
                1 -> num_display.text = (currentTotal - num_display.text.toString().toDouble()).toString()
                2 -> num_display.text = (currentTotal * num_display.text.toString().toDouble()).toString()
                3 -> num_display.text = (currentTotal / num_display.text.toString().toDouble()).toString()
            }
        }
    }
}