package com.example.whatnext

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import com.example.practice2.EListAdapter
import com.google.gson.Gson
import models.*
import java.io.InputStream


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jsonString = loadJson(this,"Page1.json")
        var courses = Gson().fromJson(jsonString, ListModel1::class.java)

//        val recycler_view = findViewById<RecyclerView>(R.id.recyclerview)
//        recycler_view.adapter = ExampleAdapter1(courses.data)
//        recycler_view.layoutManager = LinearLayoutManager(this)
//
//        recycler_view.setHasFixedSize(true)

        lateinit var listViewAdapter: EListAdapter
        lateinit var what_next : ArrayList<Model1>
        val arr : ArrayList<Model1> = ArrayList()

        var fields : HashMap<Model1,List<Fields>> = HashMap()

        for(i in 0 until courses.data.size){

            arr.add(courses.data[i])
            fields[courses.data[i]] = courses.data[i].fields
        }
        what_next = arr
        listViewAdapter = EListAdapter(this, what_next, fields)

        val elistview = findViewById<ExpandableListView>(R.id.elistview)
        elistview.setAdapter(listViewAdapter)
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