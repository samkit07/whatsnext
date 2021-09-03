package models

import com.google.gson.annotations.SerializedName

class ListModel4_5_6 {

    @SerializedName("data")
    val data : ArrayList<Model4_5_6> = ArrayList()
}

class Model4_5_6{

    @SerializedName("type")
    val type:String=""
    @SerializedName("name")
    val name:String=""
    @SerializedName("purpose")
    val purpose:String=""
    @SerializedName("eligibility")
    val eligibility:String=""
    @SerializedName("applicationMode")
    val applicationMode:String=""
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
    @SerializedName("duration")
    val duration:String=""
    @SerializedName("activity-")
    val activity:String=""
    @SerializedName("schools")
    val schools : ArrayList<Schools2> = ArrayList()




}

class Schools2 {
    var expandable: Boolean = false

    @SerializedName("name")
    val name: String = ""

    @SerializedName("website")
    val website: String = ""

    override fun toString(): String {
        return "Name: $name\nWebsite: $website"
    }
}