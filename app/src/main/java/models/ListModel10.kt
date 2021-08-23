package models

import com.google.gson.annotations.SerializedName
import java.util.AbstractCollection

class ListModel10 {

    @SerializedName("data")
    val data: ArrayList<Model10> = ArrayList()
    override fun toString(): String {

        return "$data"
    }


}

class Model10 {

    @SerializedName("name")
    val name: String = ""

    @SerializedName("courses")
    val courses: ArrayList<String> = ArrayList()

    @Override
    override fun toString(): String {
        return "$name \n $courses"
    }
}
