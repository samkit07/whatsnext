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


class Fragment2_1 : Fragment() {

    lateinit var expandView: ExpandableListView
    var main = MainActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment2_1, container, false)

        val jsonString = main.loadJson(context as MainActivity,"Page2.json")
        val courses = Gson().fromJson(jsonString, ListModel2::class.java)

        lateinit var listviewAd: EListAdapter2

        val degreeMap : HashMap<Degree, ArrayList<String>> = HashMap()

        degreeMap[courses.data[0].degree[0]] = courses.data[0].degree[0].fields

        listviewAd = EListAdapter2(context as MainActivity, courses.data[0].degree, degreeMap)
        expandView = view.findViewById(R.id.expandlist2_1)
        expandView.setAdapter(listviewAd)

        return view
    }

}