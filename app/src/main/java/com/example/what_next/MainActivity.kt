package com.example.what_next

import Models.*
import adapters.*
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment10.*
import org.json.JSONException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar=supportActionBar
        if(actionBar!=null){
            actionBar.title="What Next?"
        }

//        val fragment: Fragment = fragment10.newInstance()
//        try {
////            var obj:JSONObject = JSONObject(loadJson(this))
////            var jArray: JSONArray = obj.getJSONArray("data")
//
//            val jsonString = loadJson(this,"Page3.json")
//            val courses = Gson().fromJson(jsonString, listpage3::class.java)
//            Log.d("Page10", "$courses")
////            -------------Using RecyclerView-----------
////            rvUsersList.layoutManager = LinearLayoutManager(this)
////            val itemAdapter = UserAdapter7(courses.data)
////            rvUsersList.adapter = itemAdapter
////
////            --------------Using ExpandableListView---------------
//            lateinit var listviewAd: ExListAdapter3
//            var courselist : HashMap<page3, ArrayList<String>> = HashMap()
//            for(i in 0 until courses.data.size){
//                courselist[courses.data[i]] = courses.data[i].whatNext
//            }
//            Log.d("Page10", "$courselist")
//            listviewAd = ExListAdapter3(this, courses.data, courselist)
//            expandlist.setAdapter(listviewAd)
//
//        }catch (e:JSONException){
//            e.printStackTrace()
//        }


       }

    override fun onBackPressed() {
        super.onBackPressed()
        mainLayout.setVisibility(View.VISIBLE)
    }
    private fun replaceFragment(fragment:Fragment) {
        val fmanager = supportFragmentManager.beginTransaction()
        fmanager.replace(R.id.fragmentContainer, fragment)
        mainLayout.setVisibility(View.GONE)
        fmanager.addToBackStack(null)
        fmanager.commit()
    }

    fun onClick(v: View) {
        when (v.id) {
            R.id.fpage3 -> {
                replaceFragment(fragment3())
            }
            R.id.fpage4 -> {
                replaceFragment(fragment4())
            }
            R.id.fpage7 -> {
                replaceFragment(fragment7())
            }
            R.id.fpage9 -> {
                replaceFragment(fragment9())
            }
            R.id.fpage10 -> {
                replaceFragment(fragment10())
            }
        }}

//    -----------------------JSON Loading--------------------------
     fun loadJson(context: Context, filename:String): String? {
        var input: InputStream? = null
        var jsonString: String

        try {
            input = context.assets.open(filename)
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