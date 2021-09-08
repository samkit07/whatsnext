package com.example.whatnext.page1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.TextView
import com.example.practice2.EListAdapter1
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import com.google.gson.Gson
import models.Fields
import models.ListModel1
import models.Model1

class WhatAfter10th : Fragment() {

    lateinit var listViewAdapter: EListAdapter1
    lateinit var what_next: ArrayList<Model1>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        activity.supportActionBar?.setTitle("What after 10th")
//        activity?.upportActionBar.title = "What after 10th"
//        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
//        setHasOptionsMenu(true)

        getActivity()?.setTitle("What After 10th");
    }

    override fun onStop() {
        super.onStop()

        getActivity()?.setTitle("What Next?");
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var courses = Gson().fromJson(
            MainActivity().loadJson(context as MainActivity, "Page1.json"),
            ListModel1::class.java
        )


        val arr: ArrayList<Model1> = ArrayList()
        var fields: HashMap<Model1, List<Fields>> = HashMap()

        for (i in 0 until courses.data.size - 1) {

            arr.add(courses.data[i])
            fields[courses.data[i]] = courses.data[i].fields
        }
        what_next = arr
        listViewAdapter = EListAdapter1(context as MainActivity, arr, fields)
        val view: View = inflater.inflate(R.layout.fragment_what_after_10th, container, false)

        val str = "${courses.data[courses.data.size - 1].name} \n \n ${
            courses.data[courses.data.size - 1].jobs
                .replace(",", ", ")
        }"
        view.findViewById<TextView>(R.id.textview4_1).text = str

        val explist = view.findViewById<ExpandableListView>(R.id.elistview1)
        explist.setAdapter(listViewAdapter)
        explist.setGroupIndicator(null)
        return view

    }
}