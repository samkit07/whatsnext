package models

import com.google.gson.annotations.SerializedName

class ListModel4_5_6 {

    @SerializedName("data")
    val data : ArrayList<Model4_5_6> = ArrayList()
}

class Model4_5_6{

    @SerializedName("srNo")
    val srNo:Int=0
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
}