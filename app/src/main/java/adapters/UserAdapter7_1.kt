package adapters

import Models.Exams
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.what_next.R
import kotlinx.android.synthetic.main.page7_1.view.*
import kotlinx.android.synthetic.main.page7_1.view.tv_eligibility
import kotlinx.android.synthetic.main.page9.view.*

class UserAdapter7_1(val exlist:ArrayList<Exams>) : RecyclerView.Adapter<UserAdapter7_1.Viewholder>() {
    class Viewholder(view: View) : RecyclerView.ViewHolder(view){

        val name = view.tv_name
        val purpose = view.tv_purpose
        val eligibility = view.tv_eligibility
        val appliMode = view.tv_appliMode
        val source = view.tv_source
        val school = view.tv_school
        var linearlay:LinearLayout = view.linlay
        var exlayout = view.expandable_Rlayout
//        val expandable = view.expandable
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.page7_1,parent,false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        var item = exlist[position]
        holder.name.text = item.name
//        var a:String = item.applicationMode.joinToString(", \n")
//        holder.linearlay.setVisibility(View.INVISIBLE)
        holder.purpose.text = item.purpose
        holder.eligibility.text = item.eligibility
        holder.source.text = item.source
        holder.appliMode.text = item.applicationMode.joinToString(", \n")
        if(item.schools.size==0){holder.linearlay.setVisibility(View.GONE)}else{
        holder.school.text = item.schools.toString().replace("[", "")
            .replace("]", "").replace(",","\n").replace("name","Name").replace("website","Website")}

        val isExpandable = item.expandable
        holder.exlayout.visibility = if(isExpandable) View.VISIBLE else View.GONE
        holder.linearlay.setOnClickListener{
            val v = exlist[position]
            v.expandable = !v.expandable
            notifyItemChanged(position)
        }


    }

    override fun getItemCount(): Int {
        return exlist.size
    }
}