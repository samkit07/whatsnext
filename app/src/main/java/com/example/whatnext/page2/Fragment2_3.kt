package com.example.whatnext.page2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import com.google.gson.Gson
import models.Degree
import models.ListModel2

class Fragment2_3 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    lateinit var expandView: ExpandableListView
    var main = MainActivity()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val view = inflater.inflate(R.layout.fragment2_3, container, false)

        val jsonString = main.loadJson(context as MainActivity,"Page2.json")
        val courses = Gson().fromJson(jsonString, ListModel2::class.java)

        lateinit var listviewAd: EListAdapter2

        var degreeMap : HashMap<Degree, ArrayList<String>> = HashMap()


        for(i in 0 until courses.data[2].degree.size) {
            degreeMap[courses.data[2].degree[i]] = courses.data[2].degree[i].fields
        }

        listviewAd = EListAdapter2(context as MainActivity, courses.data[2].degree, degreeMap)
        expandView = view.findViewById(R.id.expandlist2_3)
        expandView.setAdapter(listviewAd)
        expandView.setGroupIndicator(null)
        return view
    }


}