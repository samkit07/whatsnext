package com.example.whatnext

import models.CustomGridView
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        activity.set?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val mainActivityView = (activity as MainActivity)

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val rvList: RecyclerView = view.findViewById(R.id.rvUsersList)

        val manager = GridLayoutManager(mainActivityView,2)

        rvList.layoutManager = manager
        rvList.adapter = GridRecyclerAdapter(mainActivityView,getData())

        return view
    }


    private fun getData():ArrayList<CustomGridView>{
        val list=ArrayList<CustomGridView>()

        val model1 = CustomGridView("After 10th",R.drawable.logo)
        list.add(model1)
        val model2 = CustomGridView("Talent Tests",R.drawable.logo)
        list.add(model2)
        val model3 = CustomGridView("After Intermediate",R.drawable.logo)
        list.add(model3)
        val model4 = CustomGridView("Exams After Intermediate",R.drawable.logo)
        list.add(model4)
        val model5 = CustomGridView("After Graduation",R.drawable.logo)
        list.add(model5)
        val model6 = CustomGridView("Courses Overview",R.drawable.logo)
        list.add(model6)

        return list
    }
}