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
import models.*

class Engineering : Fragment() {

//    lateinit var listViewAdapter: EListAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var courses = Gson().fromJson(
            context?.let { MainActivity().loadJson(it,"Page2.json") },
            ListModel2::class.java)

        val view : View = inflater.inflate(R.layout.fragment_what_after_12th, container, false)

//        val arr : ArrayList<Model2> = ArrayList()

//        var examsMap : HashMap<Model2,List<Examinations2>> = HashMap()
//
//        for(i in 0 until courses.data.size){
//
//            arr.add(courses.data[i])
//            examsMap[courses.data[i]] = courses.data[i].exams
//
//
//        }
//        what_next = arr
//        listViewAdapter = EListAdapter2(MainActivity(), courses.data,examsMap)
//
//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setAdapter(listViewAdapter)

//        val schools2 = view.findViewById<ExpandableListView>(R.id.elistschools2)

//        val recyler_view1_2 = view.findViewById<RecyclerView>(R.id.recycle1_2)
//        recyler_view1_2.adapter = UserAdapter1_2(courses.data)
//        recyler_view1_2.layoutManager = LinearLayoutManager(context)

        return view
    }

}