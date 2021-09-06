package com.example.whatnext.page2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatnext.GridRecyclerAdapter1
import com.example.whatnext.MainActivity
import com.example.whatnext.R
//import com.example.whatnext.com.example.whatnext.page2.EListAdapter2
import com.google.gson.Gson
import models.*

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

        val model1 = CustomGridView("Engineering", "https://images.unsplash.com/photo-1592659762303-90081d34b277")
        list.add(model1)
        val model2 = CustomGridView("Medical", "https://images.unsplash.com/photo-1576091160550-2173dba999ef")
        list.add(model2)
        val model3 = CustomGridView("Degree", "https://images.unsplash.com/photo-1456513080510-7bf3a84b82f8")
        list.add(model3)
        val model4 = CustomGridView("NDA", "https://images.unsplash.com/photo-1534724364725-325f10a8e182")
        list.add(model4)
        val model5 = CustomGridView("Teaching", "https://images.unsplash.com/photo-1573166364524-d9dbfd8bbf83")
        list.add(model5)
        val model6 = CustomGridView("Others", "https://images.unsplash.com/photo-1495446815901-a7297e633e8d")
        list.add(model6)

        return list
    }
}