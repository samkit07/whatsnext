package com.example.whatnext.page2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practice2.EListAdapter1
import com.example.whatnext.MainActivity
import com.example.whatnext.R
//import com.example.whatnext.page2.EListAdapter2
import com.google.gson.Gson
import models.*
import java.io.InputStream
import java.text.ParsePosition

class WhatAfter12th : Fragment() {

//    lateinit var listViewAdapter: EListAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        getActivity()?.setTitle("Courses After 12th");
    }

    override fun onStop() {
        super.onStop()

        getActivity()?.setTitle("What After 12th?");
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var courses = Gson().fromJson(
            context?.let { MainActivity().loadJson(it,"Page2.json") },
            ListModel2::class.java)

//
//        val arr : ArrayList<Model2> = ArrayList()
//
//        var examsMap : HashMap<Model2,List<Examinations2>> = HashMap()
//
//        for(i in 0 until courses.data.size){
//
//                arr.add(courses.data[i])
//                examsMap[courses.data[i]] = courses.data[i].exams
//        }
//
//        listViewAdapter = EListAdapter2(context as MainActivity, arr, examsMap)
//
        val view : View = inflater.inflate(R.layout.fragment_what_after_12th, container, false)
//
//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setAdapter(listViewAdapter)

        val rv =  view?.findViewById<RecyclerView>(R.id.recycle1_2)
        rv?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        rv?.adapter = UserAdapter1_2(courses.data)

//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setGroupIndicator(null)
//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setOnChildClickListener(this)

        return view

    }
}