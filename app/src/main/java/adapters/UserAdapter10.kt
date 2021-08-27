package adapters


import Models.page10
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.what_next.R
import kotlinx.android.synthetic.main.page10.view.*

class UserAdapter10(val exlist:ArrayList<page10>) : RecyclerView.Adapter<UserAdapter10.Viewholder>() {
    class Viewholder(view: View) : RecyclerView.ViewHolder(view){
        val course = view.tv_course
        val name = view.tv_name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.page10,parent,false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item = exlist[position]
        var a:String = item.courses.joinToString(", \n")
        holder.course.text = a
        holder.name.text = item.name

    }

    override fun getItemCount(): Int {
        return exlist.size
    }
}