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
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practice2.EListAdapter1
import com.example.whatnext.GridRecyclerAdapter
import com.example.whatnext.GridRecyclerAdapter1
import com.example.whatnext.MainActivity
import com.example.whatnext.R
//import com.example.whatnext.com.example.whatnext.page2.EListAdapter2
import com.google.gson.Gson
import models.*
import java.io.InputStream
import java.text.ParsePosition

class WhatAfter12th : Fragment() {

    //    lateinit var listViewAdapter: EListAdapter2
    lateinit var ft: FragmentTransaction
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
            context?.let { MainActivity().loadJson(it, "Page2.json") },
            ListModel2::class.java
        )

//
//        val arr : ArrayList<models.Model2> = ArrayList()
//
//        var examsMap : HashMap<models.Model2,List<Examinations2>> = HashMap()
//
//        for(i in 0 until courses.data.size){
//
//                arr.add(courses.data[i])
//                examsMap[courses.data[i]] = courses.data[i].exams
//        }
//
//        listViewAdapter = EListAdapter2(context as MainActivity, arr, examsMap)
        val mainActivityView = (activity as MainActivity)
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)

        val rvList: RecyclerView = view.findViewById(R.id.rvUsersList)

        val manager = GridLayoutManager(mainActivityView,2)

        rvList.layoutManager = manager
        rvList.adapter = GridRecyclerAdapter1(mainActivityView,getData())


//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setAdapter(listViewAdapter)

//        val rv =  view?.findViewById<RecyclerView>(R.id.recycle1_2)
//        rv?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
//
//        rv?.adapter = UserAdapter1_2(courses.data)

//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setGroupIndicator(null)
//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setOnChildClickListener(this)

//        view.findViewById<TextView>(R.id.fpage2_1).setOnClickListener {
//
//            ft = parentFragmentManager.beginTransaction()
//            ft.replace(R.id.wrapper, Fragment2_1())
//            ft.addToBackStack(null)
//            ft.commit()
//        }
//        view.findViewById<TextView>(R.id.fpage2_2).setOnClickListener {
//
//            ft = parentFragmentManager.beginTransaction()
//            ft.replace(R.id.wrapper, Fragment2_2())
//            ft.addToBackStack(null)
//            ft.commit()
//        }
//        view.findViewById<TextView>(R.id.fpage2_3).setOnClickListener {
//
//            ft = parentFragmentManager.beginTransaction()
//            ft.replace(R.id.wrapper, Fragment2_3())
//            ft.addToBackStack(null)
//            ft.commit()
//        }
//        view.findViewById<TextView>(R.id.fpage2_4).setOnClickListener {
//
//            ft = parentFragmentManager.beginTransaction()
//            ft.replace(R.id.wrapper, Fragment2_4())
//            ft.addToBackStack(null)
//            ft.commit()
//        }
//        view.findViewById<TextView>(R.id.fpage2_5).setOnClickListener {
//
//            ft = parentFragmentManager.beginTransaction()
//            ft.replace(R.id.wrapper, Fragment2_5())
//            ft.addToBackStack(null)
//            ft.commit()
//        }
//
//        view.findViewById<TextView>(R.id.fpage2_6).setOnClickListener {
//
//            ft = parentFragmentManager.beginTransaction()
//            ft.replace(R.id.wrapper, Fragment2_6())
//            ft.addToBackStack(null)
//            ft.commit()
//        }

        return view

    }

    private fun getData():ArrayList<CustomGridView>{
        val list=ArrayList<CustomGridView>()

        val model1 = CustomGridView("Engineering",R.drawable.logo)
        list.add(model1)
        val model2 = CustomGridView("Medical",R.drawable.logo)
        list.add(model2)
        val model3 = CustomGridView("Degree",R.drawable.logo)
        list.add(model3)
        val model4 = CustomGridView("NDA",R.drawable.logo)
        list.add(model4)
        val model5 = CustomGridView("Teaching",R.drawable.logo)
        list.add(model5)
        val model6 = CustomGridView("Others",R.drawable.logo)
        list.add(model6)

        return list
    }
}