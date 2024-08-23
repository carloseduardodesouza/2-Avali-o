package com.example.dudu

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dudu.databinding.ActivityParte1Binding


class Parte1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityParte1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar o layout usando View Binding
        binding = ActivityParte1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Verificar se os elementos do layout foram corretamente inflados
            binding.buttonA.setOnClickListener {
                val i = Intent(this, Parte2Activity::class.java)
                startActivity(i)
            }

            binding.buttonB.setOnClickListener {
                Toast.makeText(this, "Errou!", Toast.LENGTH_SHORT).show()
            }

            binding.buttonC.setOnClickListener {
                Toast.makeText(this, "Errou!", Toast.LENGTH_SHORT).show()
            }


    }
}
