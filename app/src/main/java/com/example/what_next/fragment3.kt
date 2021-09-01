package com.example.what_next

import Models.listpage10
import Models.listpage3
import Models.page10
import Models.page3
import adapters.ExListAdapter10
import adapters.ExListAdapter3
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.Toolbar
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment3 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var expandView: ExpandableListView
    var main = MainActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        (activity as AppCompatActivity?)!!.getSupportActionBar()!!.setTitle("After Graduation")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment3, container, false)

        val jsonString = main.loadJson(context as MainActivity,"Page3.json")
        val courses = Gson().fromJson(jsonString, listpage3::class.java)

        lateinit var listviewAd: ExListAdapter3
        var courselist : HashMap<page3, ArrayList<String>> = HashMap()
        for(i in 0 until courses.data.size){
            courselist[courses.data[i]] = courses.data[i].whatNext
        }
        Log.d("Page10", "$courselist")
        listviewAd = ExListAdapter3(context as MainActivity, courses.data, courselist)
        expandView = view.findViewById(R.id.expandlist3)
        expandView.setAdapter(listviewAd)

        return view
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.getSupportActionBar()!!.setTitle("What Next?")
    }

//    override fun onResume() {
//        super.onResume()
//        (activity as AppCompatActivity?)!!.getSupportActionBar()!!.setTitle("lala")
//    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment3().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}