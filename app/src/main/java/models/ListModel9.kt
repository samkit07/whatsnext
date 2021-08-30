package models

import com.google.gson.annotations.SerializedName

class ListModel9 {

    @SerializedName("data")
    val data : ArrayList<Model9> = ArrayList()
}

class Model9{


    @SerializedName("srNo")
    val srNo:Int=0
    @SerializedName("test")
    val test:String=""
    @SerializedName("eligibilty")
    val eligibilty:String=""
    @SerializedName("syllabus")
    val syllabus:String=""
    @SerializedName("website")
    val website:String=""

    var expandable:Boolean=false
}