package com.example.image_merge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.image_merge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var sayfam = binding.root
        setContentView(sayfam)

        binding.button1Id.setOnClickListener{
            binding.imageView.visibility = View.VISIBLE

//            var imageView = ImageView(this)
            var imageResourceId1 = R.drawable.ktu
            binding.imageView.setImageResource(imageResourceId1)

        }

        binding.button2Id.setOnClickListener{
            binding.imageView.visibility = View.VISIBLE

//            var imageView = ImageView(this)
            var imageResourceId2 = R.drawable.seiko
            binding.imageView.setImageResource(imageResourceId2)
        }




    }
}