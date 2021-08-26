package com.example.whatnext.page1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import com.example.practice2.EListAdapter
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import com.google.gson.Gson
import models.Fields
import models.ListModel1
import models.Model1
import java.io.InputStream

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WhatAfter10th.newInstance] factory method to
 * create an instance of this fragment.
 */
class WhatAfter10th : Fragment() {

    lateinit var listViewAdapter: EListAdapter
    lateinit var what_next : ArrayList<Model1>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var jsonString = loadJson(context as MainActivity,"Page1.json")
        var courses = Gson().fromJson(jsonString, ListModel1::class.java)


        val arr : ArrayList<Model1> = ArrayList()

        var fields : HashMap<Model1,List<Fields>> = HashMap()

        for(i in 0 until courses.data.size){

            arr.add(courses.data[i])
            fields[courses.data[i]] = courses.data[i].fields
        }
        what_next = arr
        listViewAdapter = EListAdapter(context as MainActivity, what_next, fields)
        val view : View = inflater.inflate(R.layout.what_after_10th, container, false)

        view.findViewById<ExpandableListView>(R.id.elistview).setAdapter(listViewAdapter)

        return view

    }

    private fun loadJson(context: MainActivity, filename: String): String? {

        var input: InputStream? = null
        var jsonString: String

        try {
            input = context.assets.open(filename)
            val size = input.available()
            val buffer = ByteArray(size)
            input.read(buffer)
            jsonString = String(buffer)
            return jsonString
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            input?.close()
        }
        return null
    }


}