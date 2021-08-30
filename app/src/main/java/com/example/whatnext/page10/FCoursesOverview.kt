package com.example.whatnext.page10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import com.example.practice2.EListAdapter10
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import com.google.gson.Gson
import models.*
import java.io.InputStream

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CoursesOverview.newInstance] factory method to
 * create an instance of this fragment.
 */
class CoursesOverview : Fragment() {

    lateinit var listViewAdapter: EListAdapter10


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var jsonString = loadJson(context as MainActivity,"Page10.json")
        var courses = Gson().fromJson(jsonString, ListModel10::class.java)

//        val arr : ArrayList<Model10> = ArrayList()

//        var hashmap : HashMap<Model10,List<String>> = HashMap()

        var name : ArrayList<String> = ArrayList()
//        var coursesOverview : ArrayList<ArrayList<String>> = ArrayList()
//        HashMap<Model1,List<Fields>> = HashMap()
        var coursesOverview : HashMap<String, ArrayList<String>> = HashMap()

        for(i in 0 until courses.data.size){

            name.add(courses.data[i].name)

            coursesOverview[name[i]] = courses.data[i].courses
//            coursesOverview[name[i]] = courses.data[i].courses
        }
//        what_next = arr
        listViewAdapter = EListAdapter10(context as MainActivity,name,coursesOverview)

        val view : View = inflater.inflate(R.layout.courses_overview, container, false)

        view.findViewById<ExpandableListView>(R.id.elistview10).setAdapter(listViewAdapter)

        return view

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


}