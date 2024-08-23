package com.example.dudu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dudu.databinding.ActivityParte1Binding
import com.example.dudu.databinding.ActivityParte3Binding
import com.example.dudu.databinding.ActivityParte4Binding

class Parte4Activity : AppCompatActivity(){

    private lateinit var binding: ActivityParte4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityParte4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener{

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)


        }

    }
}