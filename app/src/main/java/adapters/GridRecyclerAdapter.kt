package adapters

import Models.gridView
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.grid_layout.view.*

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import com.example.what_next.*


class GridRecyclerAdapter(private val context: Context, var exlist:ArrayList<gridView>): RecyclerView.Adapter<GridRecyclerAdapter.Viewhodlder>() {
    class Viewhodlder(itemView:View): RecyclerView.ViewHolder(itemView){
        var text = itemView.text
        var img = itemView.img
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewhodlder {
        return Viewhodlder(LayoutInflater.from(parent.context).inflate(R.layout.grid_layout, parent, false))
    }

    override fun onBindViewHolder(holder: Viewhodlder, position: Int) {
        val data = exlist[position]
        holder.text.text = exlist[position].text
        holder.img.setImageResource(exlist[position].img)
        holder.itemView.setOnClickListener{
//            Toast.makeText(context,"Clicked on : "+ position,Toast.LENGTH_SHORT).show()

            when(position) {
                0 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    val myFragment: Fragment = fragment3()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, myFragment).addToBackStack(null).commit()
                }
                1 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    val myFragment: Fragment = fragment4()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, myFragment).addToBackStack(null).commit()
                }
                2 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    val myFragment: Fragment = fragment7()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, myFragment).addToBackStack(null).commit()
                }
                3 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    val myFragment: Fragment = fragment9()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, myFragment).addToBackStack(null).commit()
                }
                4 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    val myFragment: Fragment = fragment10()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, myFragment).addToBackStack(null).commit()
                }
                5 -> {
                    val intent = Intent(context, page2Activity::class.java)
                    context.startActivity(intent)
                }
            }
        }
        }

    override fun getItemCount(): Int {
        return exlist.size
    }
}