package Page2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.what_next.R

class page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="After Intermediate" //title for actionbar
        }
//        var main = MainActivity()
//        val jsonString = main.loadJson(this,"Page2.json")
//        val courses = Gson().fromJson(jsonString, listpage2::class.java)
//
//        lateinit var listviewAd: ExListAdapter2
//        var courseList : ArrayList<String> = ArrayList()
//        var degreeMap : HashMap<String, ArrayList<String>> = HashMap()
//
//        courseList.add(courses.data[0].degree[0].course)
//        degreeMap[courseList[0]] = courses.data[0].degree[0].fields
//
//        listviewAd = ExListAdapter2(this, courseList, degreeMap)
//            expandlist2_1.setAdapter(listviewAd)
    }
    private fun replaceFragment(fragment: Fragment) {
        val fmanager = supportFragmentManager.beginTransaction()
        fmanager.replace(R.id.mainLayout, fragment)
//        mainLayout.setVisibility(View.GONE)
        fmanager.addToBackStack(null)
        fmanager.commit()
    }
//
    fun onClick(v: View) {
        when (v.id) {
            R.id.fpage2_1 -> {
                replaceFragment(fragment2_1())
            }
            R.id.fpage2_2 -> {
                replaceFragment(fragment2_2())
            }
            R.id.fpage2_3 -> {
                replaceFragment(fragment2_3())
            }
            R.id.fpage2_4 -> {
                replaceFragment(fragment2_4())
            }
            R.id.fpage2_5 -> {
                replaceFragment(fragment2_5())
            }
            R.id.fpage2_6 -> {
                replaceFragment(fragment2_6())
            }
        }
    }
}