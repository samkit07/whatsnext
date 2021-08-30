package com.example.whatnext;


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import com.example.whatnext.page1.WhatAfter10th
import com.example.whatnext.page10.FCoursesOverview
import com.example.whatnext.page9.TalentTests
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

    private fun loadJson(context: MainActivity, filename: String): String? {

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
            R.id.talenttests -> {
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, TalentTests())
                ft.addToBackStack(null)
                ft.commit();
            }
            R.id.coursesoverview -> {
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, FCoursesOverview())
                ft.addToBackStack(null)
                ft.commit();
            }
        }

    }
}


