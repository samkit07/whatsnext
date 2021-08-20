package com.example.whatnext

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import java.io.InputStream
import models.ListModel10
import android.widget.ArrayAdapter





class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jsonString = loadJson(this,"Page10.json")
        var courses = Gson().fromJson(jsonString, ListModel10::class.java)

        val recycler_view = findViewById<RecyclerView>(R.id.recyclerview)

//        val itemsAdapter: ArrayAdapter<String> =
//            ArrayAdapter<String>(this, R.id.listview1, items)
//
//        val listView = findViewById<ListView>(R.id.listview1)
//        listView.setAdapter(itemsAdapter);

        recycler_view.adapter = ExampleAdapter10(courses.data)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


//        JsonDeserializer<Timestamp>

//        Page10Deserializer
//        val gsonBuilder = GsonBuilder()

//        val courseType = object : TypeToken<List<ListModel10?>>(){}.type
//
//        gsonBuilder.registerTypeAdapter(courseType)
//        val collectionType: Type = object : TypeToken<List<ImageResult?>?>() {}.type
//        val gson: Gson = gsonBuilder.create()
//        val imageResults: List<ImageResult> = gson.fromJson(jsonObject, collectionType)


//      tv1.text = Gson().fromJson(jsonString, ListModel10::class.java).data[0].name
//        Log.d("Page3", "${courses}")
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