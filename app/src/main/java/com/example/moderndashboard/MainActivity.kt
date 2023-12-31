package com.example.moderndashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ClothingActivity::class.java)
            startActivity(intent)
        }

        val homeCard = findViewById<CardView>(R.id.homeCard)
        homeCard.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        val electronicsCard = findViewById<CardView>(R.id.electronicsCard)
        electronicsCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ElectronicsActivity::class.java)
            startActivity(intent)
        }

        val beautyCard = findViewById<CardView>(R.id.beautyCard)
        beautyCard.setOnClickListener {
            val intent = Intent(this@MainActivity, BeautyActivity::class.java)
            startActivity(intent)
        }
        val pharmacyCard = findViewById<CardView>(R.id.pharmacyCard)
        pharmacyCard.setOnClickListener {
            val intent = Intent(this@MainActivity, PharmacyActivity::class.java)
            startActivity(intent)
        }
        val groceriesCard = findViewById<CardView>(R.id.groceriesCard)
        groceriesCard.setOnClickListener {
            val intent = Intent(this@MainActivity, GroceriesActivity::class.java)
            startActivity(intent)
        }
    }
}