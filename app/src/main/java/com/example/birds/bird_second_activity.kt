package com.example.birds

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBirdSecondBinding
import com.example.birds.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class bird_second_activity : AppCompatActivity() {
    lateinit var binding: ActivityBirdSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnprevious1.setOnClickListener {
            finish()
        }

        binding.btnNext2.setOnClickListener {
            val intent = Intent(this,activity_bird_thirdd::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1611273232528-b7b75697a0a4?q=80&w=1925&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .centerInside()
            .resize(500,800)
            .into(binding.imageView2)
    }
    }
