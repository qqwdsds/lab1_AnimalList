package com.example.listapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // rounded image
        binding.tardigradeImage.clipToOutline = true
        binding.phoronidImage.clipToOutline = true
        binding.flatwormImage.clipToOutline = true

        // animals
        val tardigrade = Animal("Tardigrade", getString(R.string.tardigrade_description), R.drawable.tardigrade)
        val phoronid = Animal("Phoronid", getString(R.string.phoronid_description), R.drawable.phoronid)
        val flatworm = Animal("Flatworm", getString(R.string.flatworm_description), R.drawable.flatworm)

        // buttons listeners
        binding.tardigradeDetails.setOnClickListener{
            val i = Intent(this, DetailsActivity::class.java)
            i.putExtra(ANIMAL, tardigrade)
            startActivity(i)
        }
        binding.phoronidDetails.setOnClickListener{
            val i = Intent(this, DetailsActivity::class.java)
            i.putExtra(ANIMAL, phoronid)
            startActivity(i)
        }
        binding.flatwormDetails.setOnClickListener{
            val i = Intent(this, DetailsActivity::class.java)
            i.putExtra(ANIMAL, flatworm)
            startActivity(i)
        }
    }

    companion object{
        const val ANIMAL = "animal"
    }
}