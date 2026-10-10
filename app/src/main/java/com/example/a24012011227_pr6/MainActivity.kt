package com.example.a24012011227_pr6

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
    lateinit var alarmFrameAnimation1 : AnimationDrawable
    lateinit var alarmFrameAnimation2 : AnimationDrawable
    lateinit var img1 : ImageView
    lateinit var img2 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // card1 image
        img1 = findViewById<ImageView>(R.id.img1)
        img1.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmFrameAnimation1 = img1.background as AnimationDrawable

        // card2 image
        img2 = findViewById<ImageView>(R.id.img2)
        img2.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmFrameAnimation2 = img2.background as AnimationDrawable

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            alarmFrameAnimation1.start()
            alarmFrameAnimation2.start()
        }
        else{
            alarmFrameAnimation1.stop()
            alarmFrameAnimation2.stop()
        }
    }


}