package com.example.whatnext.page9

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
import models.ListModel9


class TalentTests : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getActivity()?.setTitle("Talent Tests")

    }

    override fun onStop() {
        super.onStop()
        getActivity()?.setTitle("What Next?")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var courses = Gson().fromJson(
            MainActivity().loadJson(context as MainActivity, "Page9.json"),
            ListModel9::class.java
        )

        val view: View = inflater.inflate(R.layout.fragment_talent_tests, container, false)

        val recyler_view9 = view.findViewById<RecyclerView>(R.id.recycle_9)

        recyler_view9.adapter = UserAdapter9(courses.data)
        recyler_view9.layoutManager = LinearLayoutManager(context)

        return view
    }

}