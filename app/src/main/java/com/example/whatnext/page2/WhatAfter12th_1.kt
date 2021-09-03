package com.example.whatnext.page2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import com.google.gson.Gson
import models.ListModel2
import models.ListModel4_5_6


class WhatAfter12th_1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        getActivity()?.setTitle("Exams After 12th");
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
            context?.let { MainActivity().loadJson(it,"Page4.json") },
            ListModel4_5_6::class.java)

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
        val view : View = inflater.inflate(R.layout.fragment_what_after12th_1, container, false)
//
//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setAdapter(listViewAdapter)

        val rv =  view?.findViewById<RecyclerView>(R.id.recycle2_2)
        rv?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        rv?.adapter = UserAdapter2_2(courses.data)

//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setGroupIndicator(null)
//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setOnChildClickListener(this)

        return view

    }
}