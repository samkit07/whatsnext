package Page2

import Models.Degree
import Models.listpage2
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import com.example.what_next.MainActivity
import com.example.what_next.R
import com.google.gson.Gson

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment2_6.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment2_6 : Fragment() {
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
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment2_6, container, false)
        val jsonString = main.loadJson(context as page2Activity,"Page2.json")
        val courses = Gson().fromJson(jsonString, listpage2::class.java)

        lateinit var listviewAd: ExListAdapter2
        var courseList : ArrayList<String> = ArrayList()
        var degreeMap : HashMap<Degree, ArrayList<String>> = HashMap()

        for(i in 0 until courses.data[5].degree.size) {
            degreeMap[courses.data[5].degree[i]] = courses.data[5].degree[i].fields
        }
        listviewAd = ExListAdapter2(context as page2Activity, courses.data[5].degree, degreeMap)
        expandView = view.findViewById(R.id.expandlist2_6)
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
         * @return A new instance of fragment fragment2_6.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment2_6().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}