package adapters

import android.annotation.SuppressLint
import android.app.PendingIntent.getActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.example.whatnext.MainActivity
import com.example.whatnext.R
import models.*

class ExampleAdapter1(
    private val exampleList: ArrayList<Model1>
) : RecyclerView.Adapter<ExampleAdapter1.ExampleViewHolder>() {

    // the parent RecyclerViews
    private val viewPool = RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.example_course1,
            parent, false
        )

        return ExampleViewHolder(itemView)
    }

    @SuppressLint("WrongConstant")
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {


        val currentCourse = exampleList[position]

        holder.textView1.text = currentCourse.type
        holder.textView2.text = currentCourse.name
        if (currentCourse.duration != "") holder.textView3.text = currentCourse.duration

        holder.recycler_view1.adapter = ExampleAdapter1_1(currentCourse.fields)
        holder.recycler_view1.layoutManager =LinearLayoutManager(holder.recycler_view1.context,
            LinearLayout.HORIZONTAL, false)

        holder.recycler_view1.setHasFixedSize(true)

//        Log.i("position", "$position")
//        Log.i("itemCount", "$itemCount")

    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView1: TextView = itemView.findViewById(R.id.textview1_1)
        val textView2: TextView = itemView.findViewById(R.id.textview2_1)
        val textView3: TextView = itemView.findViewById(R.id.textview3_1)
        val recycler_view1 = itemView.findViewById<RecyclerView>(R.id.recyclerview1)


    }


}