package com.example.listapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animal = intent.getParcelableExtra<Animal>(MainActivity.ANIMAL)

        title = animal!!.title

        binding.image.setImageResource(animal!!.image)
        binding.description.text = animal.description
    }
}