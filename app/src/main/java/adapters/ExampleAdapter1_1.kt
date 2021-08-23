package adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatnext.R
import models.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatnext.MainActivity


class ExampleAdapter1_1(
    private val exampleList: ArrayList<Fields>
) : RecyclerView.Adapter<ExampleAdapter1_1.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.example_course1_1,
            parent, false
        )

        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {

        val currentCourse = exampleList[position]

        holder.textView1_1_1.text = currentCourse.name
        holder.textView2_1_1.text = currentCourse.subFields.toString()
//        if (currentCourse.duration != "") holder.textView3.text = currentCourse.duration

        Log.i("position", "$position")
        Log.i("itemCount", "$itemCount")

    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView1_1_1: TextView = itemView.findViewById(R.id.textview1_1_1)
        val textView2_1_1: TextView = itemView.findViewById(R.id.textview2_1_1)


    }


}