package com.example.whatnext.page3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import com.google.gson.Gson
import models.ListModel1
import models.ListModel3
import models.Model3

class WhatAfterGrad : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getActivity()?.setTitle("What After Graduation?")
    }

    override fun onStop() {
        super.onStop()
        getActivity()?.setTitle("What Next?")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_what_after_grad, container, false)

        var courses = Gson().fromJson(
            MainActivity().loadJson(context as MainActivity,"Page3.json"),
            ListModel3::class.java)

        var listviewAd: EListAdapter3

        var courselist : HashMap<Model3, ArrayList<String>> = HashMap()
        for(i in 0 until courses.data.size){
            courselist[courses.data[i]] = courses.data[i].whatNext
        }
//        Log.d("Page10", "$courselist")
        val elist1_3 = view.findViewById<ExpandableListView>(R.id.elist1_3)
        listviewAd = EListAdapter3(context as MainActivity, courses.data, courselist)
        elist1_3.setAdapter(listviewAd)

        elist1_3.setGroupIndicator(null)
        return view

    }


}