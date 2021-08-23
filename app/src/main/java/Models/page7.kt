package Models

import com.google.gson.annotations.SerializedName

data class listpage7 (
    @SerializedName("data")
    val data : ArrayList<page7>
)
data class page7 (
    @SerializedName("course")
    val course:String,
    @SerializedName("exams")
    val exams:ArrayList<Exams>,
)
data class Exams(
    @SerializedName("name")
    val name:String,
    @SerializedName("purpose")
    val purpose:String,
    @SerializedName("eligibility")
    val eligibility:String,
    @SerializedName("applicationMode")
    val applicationMode:ArrayList<String>,
    @SerializedName("source")
    val source:String
)