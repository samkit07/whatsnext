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

        val manager = GridLayoutManager(mainActivityView, 2)

        rvList.layoutManager = manager
        rvList.adapter = GridRecyclerAdapter(mainActivityView, getData())

        return view
    }


    fun getData():ArrayList<CustomGridView>{

        val list=ArrayList<CustomGridView>()

        val model1 = CustomGridView("After 10th","https://images.unsplash.com/photo-1519452635265-7b1fbfd1e4e0")
        list.add(model1)
        val model2 = CustomGridView("Talent Tests","https://images.unsplash.com/photo-1606326608606-aa0b62935f2b")
        list.add(model2)
        val model3 = CustomGridView("After Intermediate","https://images.unsplash.com/photo-1606761568499-6d2451b23c66")
        list.add(model3)
        val model4 = CustomGridView("Exams After Intermediate","https://images.unsplash.com/photo-1434030216411-0b793f4b4173")
        list.add(model4)
        val model5 = CustomGridView("After Graduation","https://images.unsplash.com/photo-1525921429624-479b6a26d84d")
        list.add(model5)
        val model6 = CustomGridView("Courses Overview","https://images.unsplash.com/photo-1501504905252-473c47e087f8")
        list.add(model6)

        return list
    }


//    https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.99images.com%2Fapps%2Feducation%2Fcom.ilmkidunya.tenthclass%2Fdownload&psig=AOvVaw2RgO0HiyWuk-Fb5vD6B_p-&ust=1631013364589000&source=images&cd=vfe&ved=0CAgQjRxqFwoTCNDhob-c6vICFQAAAAAdAAAAABAD

}