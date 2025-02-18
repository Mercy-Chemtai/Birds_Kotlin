package com.example.birds

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBirdFifthBinding
import com.example.birds.databinding.ActivityBirdFourthBinding
import com.squareup.picasso.Picasso

class activity_bird_fifth : AppCompatActivity() {
        lateinit var binding: ActivityBirdFifthBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityBirdFifthBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnprev5.setOnClickListener {
                finish()
            }

            Picasso
                .get()
                .load("https://images.unsplash.com/photo-1611273232509-8ded209114c6?q=80&w=2080&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
                .centerInside()
                .resize(500,800)
                .into(binding.imageView12)
        }
    }