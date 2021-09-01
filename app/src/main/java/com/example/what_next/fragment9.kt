package com.example.what_next

import Models.listpage7
import Models.listpage9
import adapters.UserAdapter7
import adapters.UserAdapter9
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment9.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment9 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var recyclerView: RecyclerView
    var main = MainActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        (activity as AppCompatActivity?)!!.getSupportActionBar()!!.setTitle("Talent Tests")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment9, container, false)
        val jsonString = main.loadJson(context as MainActivity,"Page9.json")
        val courses = Gson().fromJson(jsonString, listpage9::class.java)

        val itemAdapter = UserAdapter9(courses.data)
        recyclerView = view.findViewById(R.id.rvUsersList)
        recyclerView.adapter = itemAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }
    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.getSupportActionBar()!!.setTitle("What Next?")
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment9.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment9().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}