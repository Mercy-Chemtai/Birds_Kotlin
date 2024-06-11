package com.example.birds

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBirdThirddBinding
import com.squareup.picasso.Picasso

class activity_bird_thirdd : AppCompatActivity() {
    lateinit var binding: ActivityBirdThirddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdThirddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev3.setOnClickListener {
            finish()
        }

        binding.btnnext3.setOnClickListener {
            val intent = Intent(this,activity_bird_fourth::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://plus.unsplash.com/premium_photo-1691938884524-a26f84266886?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .centerInside()
            .resize(500,800)
            .into(binding.imageView3)
    }
}