package com.example.streetwearmagazine

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgPhoto: ImageView = findViewById(R.id.detail_image)
        val tvName: TextView = findViewById(R.id.detail_name)
        val tvDescription: TextView = findViewById(R.id.detail_description)

        // Menerima data dari intent
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val photoId = intent.getIntExtra("photo", 0)

        tvName.text = name
        tvDescription.text = description
        imgPhoto.setImageResource(photoId)
    }
}
