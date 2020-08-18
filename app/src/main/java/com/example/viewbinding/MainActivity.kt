package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        with(binding){
            setContentView(binding.root)
            btnAdd.setOnClickListener {
                textResult.text = add(no1.text.toString(),no2.text.toString(),no3.text.toString() ).toString()
            }
        }
    }

    fun add(n1: String, n2:String, n3:String) : Int{
        return Integer.parseInt(n1) + Integer.parseInt(n2) + Integer.parseInt(n3) ;
    }
}