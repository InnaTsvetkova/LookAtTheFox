package com.example.lookatthefox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.example.lookatthefox.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val randomId = Random.nextInt(1,121)
            val uri = "https://randomfox.ca/images/$randomId.jpg"
            binding.image.load(uri)
        }
    }
}