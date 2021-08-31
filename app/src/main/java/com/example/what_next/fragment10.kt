package com.example.what_next

import Models.listpage10
import Models.listpage7
import Models.page10
import adapters.ExListAdapter10
import adapters.UserAdapter10
import adapters.UserAdapter7
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment10.*
import java.io.InputStream

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment10.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment10 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var expandView:ExpandableListView
    var main = MainActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment10, container, false)

        val jsonString = main.loadJson(context as MainActivity,"Page10.json")
        val courses = Gson().fromJson(jsonString, listpage10::class.java)

//            -------------Using RecyclerView-----------
//        rvUsersList.layoutManager = LinearLayoutManager(this)
//        val itemAdapter = UserAdapter10(courses.data)
//        recyclerView = view.findViewById(R.id.expandlist)
//        recyclerView.adapter = itemAdapter
//        recyclerView.layoutManager = LinearLayoutManager(context)

//            -------------Using ExpandableListView---------------
            lateinit var listviewAd: ExListAdapter10
            var courselist : HashMap<page10, ArrayList<String>> = HashMap()
            for(i in 0 until courses.data.size){
                courselist[courses.data[i]] = courses.data[i].courses
            }
            listviewAd = ExListAdapter10(context as MainActivity, courses.data, courselist)
            expandView = view.findViewById(R.id.expandlist)
            expandView.setAdapter(listviewAd)
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment10.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment10().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}