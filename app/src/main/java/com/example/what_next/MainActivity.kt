package com.example.what_next

import Models.*
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    val userlist: ArrayList<page7> = ArrayList()
        try {
            val jsonString = loadJson(this)
            val courses = Gson().fromJson(jsonString, listpage7::class.java)
            rvUsersList.layoutManager = LinearLayoutManager(this)
            val itemAdapter = UserAdapter7(courses.data)
            rvUsersList.adapter = itemAdapter
        }catch (e:JSONException){
            e.printStackTrace()
        }


      //  Log.d("MainActivity","${jsonString}")



       // Log.d("Page10", "$courses")

      //  Log.d("Page1",${courses.data.GovtJobs.get(0)})
    }
    private fun loadJson(context: Context): String? {
        var input: InputStream? = null
        var jsonString: String

        try {
            input = context.assets.open("Page7.json")
            val size = input.available()

            val buffer = ByteArray(size)
            input.read(buffer)

            jsonString = String(buffer)
            return jsonString
        } catch (ex: Exception) {
            ex.printStackTrace()
        } finally {
            input?.close()
        }
        return null
    }
}