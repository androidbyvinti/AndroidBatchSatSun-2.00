package com.bmpl.imageapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // step-1 : downcasting
        // step-2 : Attach Listener
        // step-3 : Attach handler

        // step-1: Downcasting

        var button1 : Button = findViewById(R.id.imageOne)
        var button2 : Button = findViewById(R.id.imageTwo)
        var image : ImageView = findViewById(R.id.resultImage)

        // step-2: Attach Listener
        button1.setOnClickListener {
            image.setImageResource(R.drawable.image2)
        }

        button2.setOnClickListener {
            image.setImageResource(R.drawable.image3)
        }

    }
}
