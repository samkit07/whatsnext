package com.example.whatnext;


import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import models.CustomGridView
import java.io.InputStream


class MainActivity : AppCompatActivity() {

    lateinit var ft: FragmentTransaction
    lateinit var fm: FragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#003153")))
        setContentView(R.layout.activity_main)

        supportFragmentManager.addOnBackStackChangedListener { setupHomeAsUp() }
//        setupHomeAsUp()

        fm = supportFragmentManager
        ft = fm.beginTransaction()
        ft.replace(R.id.wrapper, MainFragment())
        ft.commit()

    }

    private fun setupHomeAsUp() {
        val shouldShow = 0 < supportFragmentManager.backStackEntryCount
        supportActionBar?.setDisplayHomeAsUpEnabled(shouldShow)
    }

    override fun onSupportNavigateUp(): Boolean =
        supportFragmentManager.popBackStack().run { true }


    fun loadJson(context: Context, filename: String): String? {

        var input: InputStream? = null
        var jsonString: String

        try {
            input = context.assets.open(filename)
            val size = input.available()
            val buffer = ByteArray(size)
            input.read(buffer)
            jsonString = String(buffer)
            return jsonString
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            input?.close()
        }
        return null
    }

//    fun onClick(v: View) {
//        when (v.id) {
//
//            R.id.after10th -> {
//                ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.wrapper, WhatAfter10th())
//                ft.addToBackStack(null)
//                ft.commit()
//            }
//            R.id.after12th -> {
//
////                val intent = Intent(this, AWhatAfter12th::class.java)
////                startActivity(intent)
////                supportActionBar?.setTitle("What after 12th")
//                ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.wrapper, MainFragment1())
//                ft.addToBackStack(null)
//                ft.commit();
//            }
//            R.id.aftergrad -> {
//                ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.wrapper, WhatAfterGrad())
//                ft.addToBackStack(null)
//                ft.commit();
//            }
//            R.id.talenttests -> {
//
//                ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.wrapper, TalentTests())
//                ft.addToBackStack(null)
//                ft.commit();
//            }
//
//            R.id.coursesoverview -> {
//                ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.wrapper, CoursesOverview())
//                ft.addToBackStack(null)
//                ft.commit();
//            }
//        }
//
//    }
}


