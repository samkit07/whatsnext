package Models

import com.google.gson.annotations.SerializedName

data class listpage7 (
    @SerializedName("data")
    val data : ArrayList<page7> = ArrayList()
)
data class page7 (
    @SerializedName("course")
    val course:String = "",
    @SerializedName("exams")
    val exams:ArrayList<Exams> = ArrayList(),
)
data class Exams(
    @SerializedName("name")
    val name:String = "",
    @SerializedName("purpose")
    val purpose:String = "",
    @SerializedName("eligibility")
    val eligibility:String = "",
    @SerializedName("applicationMode")
    val applicationMode:ArrayList<String> = ArrayList(),
    @SerializedName("source")
    val source:String = "",
    @SerializedName("schools")
    val schools:ArrayList<Schools> = ArrayList(),
    var expandable:Boolean = false
//    var expand:Boolean = false
)
class Schools{
    @SerializedName("name")
    val name: String = ""
    @SerializedName("website")
    val website: String = ""
    override fun toString(): String {
        return "Name: $name\nWebsite: $website"
    }
}