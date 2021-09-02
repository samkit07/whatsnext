package com.example.what_next

import Models.*
import adapters.*
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment10.*
import org.json.JSONException
import java.io.InputStream

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar=supportActionBar
        if(actionBar!=null){
            actionBar.title="What Next?"
        }


//        val fragment: Fragment = fragment10.newInstance()
        try {
//            var obj:JSONObject = JSONObject(loadJson(this))
//            var jArray: JSONArray = obj.getJSONArray("data")

            val jsonString = loadJson(this,"Page2.json")
            val courses = Gson().fromJson(jsonString, listpage2::class.java)
            Log.d("Page10", "$courses")
//            -------------Using RecyclerView-----------
//            rvUsersList.layoutManager = LinearLayoutManager(this)
//            val itemAdapter = UserAdapter7(courses.data)
//            rvUsersList.adapter = itemAdapter
//
//            --------------Using ExpandableListView---------------
//            lateinit var listviewAd: ExListAdapter3
//            var courselist : HashMap<page3, ArrayList<String>> = HashMap()
//            for(i in 0 until courses.data.size){
//                courselist[courses.data[i]] = courses.data[i].whatNext
//            }
//            Log.d("Page10", "$courselist")
//            listviewAd = ExListAdapter3(this, courses.data, courselist)
//            expandlist.setAdapter(listviewAd)

        }catch (e:JSONException){
            e.printStackTrace()
        }

//        ---------------------Recycler GridView--------------------------
        var rvList:RecyclerView
        var manager = GridLayoutManager(this,2)
        rvList= findViewById(R.id.rvUsersList)
        rvList.layoutManager = manager
        rvList.adapter = GridRecyclerAdapter(this,getData())
        getData()


       }
//        override fun onCellClickListener() {
//            Toast.makeText(this, "Cell clicked", Toast.LENGTH_SHORT).show()
//        }
    private fun getData():ArrayList<gridView>{
        var list=ArrayList<gridView>()
//        var model = gridView("After Graduation",R.drawable.logo)
//        list.add(model)
        var model1 = gridView("After Intermediate",R.drawable.logo)
        list.add(model1)
        var model2 = gridView("After Graduation",R.drawable.logo)
        list.add(model2)
        var model3 = gridView("Exams After Intermediate",R.drawable.logo)
        list.add(model3)
        var model4 = gridView("Exams",R.drawable.logo)
        list.add(model4)
        var model5 = gridView("Talent Tests",R.drawable.logo)
        list.add(model5)
        var model6 = gridView("Courses",R.drawable.logo)
        list.add(model6)
        return list
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        mainLayout.setVisibility(View.VISIBLE)
//    }
//    private fun replaceFragment(fragment:Fragment) {
//        val fmanager = supportFragmentManager.beginTransaction()
//        fmanager.replace(R.id.fragmentContainer, fragment)
//        mainLayout.setVisibility(View.GONE)
//        fmanager.addToBackStack(null)
//        fmanager.commit()
//    }
//
//    fun onClick(v: View) {
//        when (v.id) {
//            R.id.fpage3 -> {
//                replaceFragment(fragment3())
//            }
//            R.id.fpage4 -> {
//                replaceFragment(fragment4())
//            }
//            R.id.fpage7 -> {
//                replaceFragment(fragment7())
//            }
//            R.id.fpage9 -> {
//                replaceFragment(fragment9())
//            }
//            R.id.fpage10 -> {
//                replaceFragment(fragment10())
//            }
//        }}

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