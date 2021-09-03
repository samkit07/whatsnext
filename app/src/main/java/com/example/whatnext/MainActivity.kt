package com.example.whatnext;


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.whatnext.page1.WhatAfter10th
import com.example.whatnext.page10.CoursesOverview
import com.example.whatnext.page2.WhatAfter12th
import com.example.whatnext.page2.Engineering
import com.example.whatnext.page3.WhatAfterGrad
import com.example.whatnext.page9.TalentTests
import java.io.InputStream
import android.app.Application
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import com.example.whatnext.page2.MainFragment1


class MainActivity : AppCompatActivity() {
    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.wrapper, MainFragment())
        ft.commit()


    }

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



    fun onClick(v: View) {
        when (v.id) {

            R.id.after10th -> {
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, WhatAfter10th())
                ft.addToBackStack(null)
                ft.commit()
            }
            R.id.after12th -> {

//                val intent = Intent(this, AWhatAfter12th::class.java)
//                startActivity(intent)
//                supportActionBar?.setTitle("What after 12th")
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, MainFragment1())
                ft.addToBackStack(null)
                ft.commit();
            }
            R.id.aftergrad -> {
//            supportActionBar?.setTitle("What after Graduation")
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, WhatAfterGrad())
                ft.addToBackStack(null)
                ft.commit();
            }
            R.id.talenttests -> {

                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, TalentTests())
                ft.addToBackStack(null)
                ft.commit();
            }

            R.id.coursesoverview -> {
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.wrapper, CoursesOverview())
                ft.addToBackStack(null)
                ft.commit();
            }
        }

    }
}


