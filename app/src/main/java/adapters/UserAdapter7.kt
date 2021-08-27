package adapters

import Models.page7
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.what_next.R
import kotlinx.android.synthetic.main.page7.view.*

class UserAdapter7(val exlist:ArrayList<page7>) : RecyclerView.Adapter<UserAdapter7.Viewholder>() {
    class Viewholder(view: View) : RecyclerView.ViewHolder(view){
        val course = view.tv_course
        val rv = view.rvpage7
//        val linearcl = view.linearclick
//        val name = view.tv_name
//        val purpose = view.tv_purpose
//        val eligibility = view.tv_eligibility
//        val appliMode = view.tv_appliMode
//        val source = view.tv_source
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.page7,parent,false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item = exlist[position]
        holder.course.text = item.course
        holder.rv.adapter = UserAdapter7_1(item.exams)
        holder.rv.layoutManager = LinearLayoutManager(holder.rv.context,RecyclerView.HORIZONTAL, false)
        holder.rv.setHasFixedSize(true)


//        var ex:ArrayList<Exams> = item.exams
//        Log.d("ex", ex.toString())
//        for(i in 0..ex.size-1){
//            holder.name.text = item.exams[i].name}
//        holder.purpose.text = item.exams[0].purpose
//        holder.eligibility.text = item.exams[0].eligibility
//        holder.appliMode.text = item.exams[0].applicationMode.toString()
//        holder.source.text = item.exams[0].source
    }

    override fun getItemCount(): Int {
        return exlist.size
    }
}