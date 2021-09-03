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

class CoursesOverview : Fragment() {

    lateinit var listViewAdapter: EListAdapter10


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getActivity()?.setTitle("Courses Overview")
    }

    override fun onStop() {
        super.onStop()

        getActivity()?.setTitle("What Next?")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val courses = Gson().fromJson(
            MainActivity().loadJson(context as MainActivity, "Page10.json"),
            ListModel10::class.java
        )

        val name: ArrayList<String> = ArrayList()

        val coursesOverview: HashMap<String, ArrayList<String>> = HashMap()

        for (i in 0 until courses.data.size) {

            name.add(courses.data[i].name)

            coursesOverview[name[i]] = courses.data[i].courses

        }

        listViewAdapter = EListAdapter10(context as MainActivity, name, coursesOverview)

        val view: View = inflater.inflate(R.layout.courses_overview, container, false)

        view.findViewById<ExpandableListView>(R.id.elistview10).setAdapter(listViewAdapter)

        return view

    }

}