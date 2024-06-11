package com.example.birds

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBirdFourthBinding
import com.example.birds.databinding.ActivityBirdThirddBinding
import com.squareup.picasso.Picasso

class activity_bird_fourth : AppCompatActivity() {
    lateinit var binding: ActivityBirdFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnprev4.setOnClickListener {
            finish()
        }

        binding.btnnext4.setOnClickListener {
            val intent = Intent(this,activity_bird_fourth::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1696331168355-3dc7a08d76e2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .centerInside()
            .resize(500,800)
            .into(binding.imageView4)
    }
}