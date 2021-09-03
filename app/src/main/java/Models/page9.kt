package Models

import com.google.gson.annotations.SerializedName

class listpage9 {
    @SerializedName("data")
    var data:ArrayList<page9> = ArrayList()
}

class page9 {
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