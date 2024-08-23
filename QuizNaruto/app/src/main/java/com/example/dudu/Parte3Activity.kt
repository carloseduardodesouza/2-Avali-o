package com.example.dudu

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dudu.databinding.ActivityParte2Binding
import com.example.dudu.databinding.ActivityParte3Binding

class Parte3Activity: AppCompatActivity(){

    private lateinit var binding: ActivityParte3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityParte3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonA.setOnClickListener{

            Toast.makeText(this, "Errou!", Toast.LENGTH_SHORT).show()

        }

        binding.buttonB.setOnClickListener{

            val i = Intent(this, Parte4Activity::class.java)
            startActivity(i)


        }

        binding.buttonC.setOnClickListener{

            Toast.makeText(this, "Errou!", Toast.LENGTH_SHORT).show()

        }

    }
}