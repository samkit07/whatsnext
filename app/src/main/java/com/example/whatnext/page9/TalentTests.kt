package com.example.whatnext.page9

import adapters.UserAdapter9
import android.os.Bundle
import android.os.RecoverySystem
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import com.google.gson.Gson
import models.ListModel1
import models.ListModel9
import org.w3c.dom.Text
import java.io.InputStream

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TalentTests.newInstance] factory method to
 * create an instance of this fragment.
 */
class TalentTests : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var jsonString = loadJson(context as MainActivity ,"Page9.json")
        var courses = Gson().fromJson(jsonString, ListModel9::class.java)

        val view : View = inflater.inflate(R.layout.fragment_talent_tests, container, false)

        val recyler_view9 = view.findViewById<RecyclerView>(R.id.recycle_9)

        recyler_view9.adapter = UserAdapter9(courses.data)
        recyler_view9.layoutManager = LinearLayoutManager(context)

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