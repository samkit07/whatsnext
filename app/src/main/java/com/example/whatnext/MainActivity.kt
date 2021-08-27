package com.example.whatnext;


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.whatnext.R
import com.example.whatnext.page1.WhatAfter10th
import com.example.whatnext.page10.CoursesOverview
import com.google.gson.Gson
import models.ListModel1
import models.Model1
import java.io.InputStream


class MainActivity : AppCompatActivity() {
    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.wrapper, MainFragment())
        ft.commit()

    }

    fun onClick(v: View) {
        when (v.id) {

            R.id.after10th -> {
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, WhatAfter10th())
                ft.addToBackStack(null)
                ft.commit()

            }
//            R.id.after12th -> {
//                ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.wrapper, WhatAfter12th())
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
//                ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.wrapper, TalentTests())
//                ft.addToBackStack(null)
//                ft.commit();
//            }
            R.id.coursesoverview -> {
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, CoursesOverview())
                ft.addToBackStack(null)
                ft.commit();
            }
        }

    }
}


