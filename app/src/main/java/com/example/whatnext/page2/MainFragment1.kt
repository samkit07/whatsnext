package com.example.whatnext.page2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.whatnext.MainActivity
import com.example.whatnext.R


class MainFragment1 : Fragment() {

    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getActivity()?.setTitle("What After 12th?");
    }

    override fun onStop() {
        super.onStop()

        getActivity()?.setTitle("What After 12th?");
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main1, container, false)

        view.findViewById<TextView>(R.id.courses2).setOnClickListener {

            ft = parentFragmentManager.beginTransaction()
            ft.replace(R.id.wrapper, WhatAfter12th())
            ft.addToBackStack(null)
            ft.commit()
        }


        view.findViewById<TextView>(R.id.exams2).setOnClickListener {


            ft = parentFragmentManager.beginTransaction()
            ft.replace(R.id.wrapper, WhatAfter12th_1())
            ft.addToBackStack(null)
            ft.commit()
        }

        return view
    }

//    private fun onClick(v: View) {
//
//        when(v.id){
//
//            R.id.courses2 -> {
//                ft.replace(R.id.wrapper, WhatAfter12th())
//                ft.addToBackStack(null)
//                ft.commit();
//
//            }
//
//            R.id.exams2 -> {
//
//
//            }
//        }
//    }


}