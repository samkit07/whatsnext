package models

import com.google.gson.annotations.SerializedName

class ListModel8 {

    @SerializedName("data")
    val data : ArrayList<Model8> = ArrayList()
}

class Model8{

    @SerializedName("name")
    val name:String=""
    @SerializedName("purpose")
    val purpose:String=""
    @SerializedName("applicationMode")
    val applicationMode:String=""
    @SerializedName("activity")
    val activity:String=""
    @SerializedName("source")
    val source:String=""
    @SerializedName("schools")
    val school:ArrayList<Schools> = ArrayList()

}

class Schools {
    @SerializedName("id")
    val id: Int = 0
    @SerializedName("name")
    val name: String = ""
    @SerializedName("website")
    val website: String = ""
}