package com.example.utsmp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CardItem(val imageResId: Int, val text: String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val dataList = listOf(
            CardItem(R.drawable.ellips1, "Yoga"),
            CardItem(R.drawable.ellips5, "Gym"),
            CardItem(R.drawable.ellips4, "Cardio"),
            CardItem(R.drawable.ellips3, "Stretch"),
            CardItem(R.drawable.ellips2, "Full Body")
        )

        val adapter = CardAdapter(dataList)
        recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
    }
}
