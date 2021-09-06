package com.example.whatnext

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.core.content.ContextCompat.startActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed


class SplashScreenActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_screen)
            supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#003153")))
            Handler(Looper.getMainLooper()).postDelayed({

                startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
                finish()
            }, 2000)
        }
    }
