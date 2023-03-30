package com.burakkirgil.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.burakkirgil.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var value1 : Int? = null
    var value2 : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
    fun sum(view : View) {
        value1 = binding.editTextNumber.text.toString().toIntOrNull()
        value2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if(value1 == null || value2 == null) {
            binding.resultText.text = "Input that you enter must be number"

        }
        else {
            binding.resultText.text = " Result : ${value1!! + value2!!}"
        }

    }
    fun subtract(view : View) {
        value1 = binding.editTextNumber.text.toString().toIntOrNull()
        value2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if(value1 == null || value2 == null) {
            binding.resultText.text = "Input that you enter must be number"

        }
        else {
            binding.resultText.text = " Result : ${value1!! - value2!!}"
        }

    }
    fun divide(view : View) {
        value1 = binding.editTextNumber.text.toString().toIntOrNull()
        value2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if(value1 == null || value2 == null) {
            binding.resultText.text = "Input that you enter must be number"

        }
        else {
            if((value1!! % value2!!) != 0) {
                binding.resultText.text = " Result : ${value1!!.toDouble() / value2!!.toDouble()}"
            }
            else{
                binding.resultText.text = " Result : ${value1!!/ value2!!}"
            }
        }

    }
    fun multiply(view : View) {
        value1 = binding.editTextNumber.text.toString().toIntOrNull()
        value2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if(value1 == null || value2 == null) {
            binding.resultText.text = "Input that you enter must be number"

        }
        else {
            binding.resultText.text = " Result : ${value1!! * value2!!}"
        }

    }
}