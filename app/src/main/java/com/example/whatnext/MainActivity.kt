package com.example.whatnext

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.gson.Gson
import models.ListModel10
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var tv1 = findViewById<TextView>(R.id.textview1)
//        var tv2 = findViewById<TextView>(R.id.textview2)
//        var tv3 = findViewById<TextView>(R.id.textview3)
//        var tv4 = findViewById<TextView>(R.id.textview4)

//        for(i in 10 until 11) {
//
//            var jsonString = loadJson(this,"Page$i.json")
//            tv1.text = Gson().fromJson(jsonString, ListModel10::class.java).data[0].name
//
//            tv1.text = courses
//        }

        var jsonString = loadJson(this,"Page10.json")
        var courses = Gson().fromJson(jsonString, ListModel10::class.java)


//      tv1.text = Gson().fromJson(jsonString, ListModel10::class.java).data[0].name

//

//        Log.d("Page1", "${courses.data[0].Education[0].fields}")
    }

    private fun loadJson(context: Context, filename: String) : String?{

        var input: InputStream? = null
        var jsonString: String

        try{
            input = context.assets.open(filename)
            val size = input.available()
            val buffer = ByteArray(size)
            input.read(buffer)
            jsonString = String(buffer)
            return jsonString
        }

        catch(e: Exception){
            e.printStackTrace()
        }

        finally {
            input?.close()
        }
        return null
    }
}