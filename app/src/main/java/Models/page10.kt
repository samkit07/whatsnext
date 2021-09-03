package Models

import com.google.gson.annotations.SerializedName

class listpage10 {
    @SerializedName("data")
    val data : ArrayList<page10> = ArrayList()
}

class page10 {
    @SerializedName("name")
    val name:String=""
    @SerializedName("courses")
    val courses:ArrayList<String> = ArrayList()
}