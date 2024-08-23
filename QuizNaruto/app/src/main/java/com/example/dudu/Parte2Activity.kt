package com.example.dudu

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dudu.databinding.ActivityParte2Binding

class Parte2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityParte2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar o layout usando View Binding
        binding = ActivityParte2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Verificar se os elementos do layout foram corretamente inflados
            // Configurar os listeners de clique para os botões
            binding.buttonA.setOnClickListener {
                Toast.makeText(this, "Errou!", Toast.LENGTH_SHORT).show()
            }

            binding.buttonB.setOnClickListener {
                Toast.makeText(this, "Errou!", Toast.LENGTH_SHORT).show()
            }

            binding.buttonD.setOnClickListener {
                val i = Intent(this, Parte3Activity::class.java)
                startActivity(i)
            }

    }
}
