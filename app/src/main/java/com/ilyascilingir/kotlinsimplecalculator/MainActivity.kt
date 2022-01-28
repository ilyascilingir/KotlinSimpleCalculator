package com.ilyascilingir.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ilyascilingir.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    var number1 : Int? = null
    var number2 : Int? = null
    var lastResult : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun sum (view : View) {

        number1 = binding.number1.text.toString().toIntOrNull()
        number2 = binding.number2.text.toString().toIntOrNull()

       if( number1 == null || number2 == null){
           binding.lastResult.setText("Enter number")
       }else{
           lastResult = number1!! + number2!!
           binding.lastResult.setText("Result: ${lastResult}")
       }

    }

    fun substract (view : View) {

        number1 = binding.number1.text.toString().toIntOrNull()
        number2 = binding.number2.text.toString().toIntOrNull()

        if( number1 == null || number2 == null){
            binding.lastResult.setText("Enter number")
        }else{
            lastResult = number1!! - number2!!
            binding.lastResult.setText("Result: ${lastResult}")
        }

    }

    fun multiply (view : View) {

        number1 = binding.number1.text.toString().toIntOrNull()
        number2 = binding.number2.text.toString().toIntOrNull()

        if( number1 == null || number2 == null){
            binding.lastResult.setText("Enter number")
        }else{
            lastResult = number1!! * number2!!
            binding.lastResult.setText("Result: ${lastResult}")
        }

    }

    fun divide (view : View) {

        number1 = binding.number1.text.toString().toIntOrNull()
        number2 = binding.number2.text.toString().toIntOrNull()

        if( number1 == null || number2 == null){
            binding.lastResult.setText("Enter number")
        }else{
            lastResult = number1!! / number2!!
            binding.lastResult.setText("Result: ${lastResult}")
        }

    }
}