package Models

import com.google.gson.annotations.SerializedName

class listpage4 {
    @SerializedName("data")
    var data:ArrayList<page4> = ArrayList()
}

class page4 {
    @SerializedName("name")
    val name:String=""
    @SerializedName("conductedBy")
    val conductedBy:String=""
    @SerializedName("applicationFor")
    val applicationFor:String=""
    @SerializedName("notificationMonth")
    val notificationMonth:String=""
    @SerializedName("modeOfSelection")
    val modeOfSelection:String=""
    @SerializedName("website")
    val website:String=""
    var expandable:Boolean = false
}