package com.example.what_next

import Models.*
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 //       val tvJsonString=findViewById(R.id.tvJsonString)
        val jsonString = loadJson(this)
      //  Log.d("MainActivity","${jsonString}")

        val courses = Gson().fromJson(jsonString, listpage4::class.java)

        Log.d("Page10", "$courses")

      //  Log.d("Page1",${courses.data.GovtJobs.get(0)})
    }
    private fun loadJson(context: Context): String? {
        var input: InputStream? = null
        var jsonString: String

        try {
            input = context.assets.open("Page4.json")
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