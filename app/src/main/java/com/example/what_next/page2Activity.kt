package com.example.what_next

import Models.listpage3
import Models.page3
import adapters.ExListAdapter2
import adapters.ExListAdapter3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson

class page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        var main = MainActivity()
        val jsonString = main.loadJson(this,"Page3.json")
        val courses = Gson().fromJson(jsonString, listpage3::class.java)

        lateinit var listviewAd: ExListAdapter2
        var courseList : ArrayList<String> = ArrayList()
        var degree : HashMap<String, ArrayList<String>> = HashMap()

//        courseList.add
//        }
//        listviewAd = ExListAdapter2(this, courses.data, courselist)
//            expandlist.setAdapter(listviewAd)
    }
}