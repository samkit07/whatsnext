package models

import com.google.gson.annotations.SerializedName

class ListModel7 {

    @SerializedName("data")
    val data : ArrayList<Model7> = ArrayList()
}

class Model7{

    @SerializedName("Engineering Exams")
    val Engineering_exams:ArrayList<Exams> = ArrayList()
    @SerializedName("Medical Exams")
    val Medical_exams:ArrayList<Exams> = ArrayList()
    @SerializedName("Marine, Navy, Defence Exams")
    val Indian_force_exams:ArrayList<Exams> = ArrayList()
    @SerializedName("Agriculture & Hotel Management Exams")
    val Agriculture_HM_Exams:ArrayList<Exams> = ArrayList()

    @SerializedName("Law")
    val law:ArrayList<Exams> = ArrayList()
}

class Exams{
    @SerializedName("name")
    val name:String=""
    @SerializedName("purpose")
    val purpose:String=""
    @SerializedName("eligibility")
    val eligibility:String=""
    @SerializedName("applicationMode")
    val applicationMode:ArrayList<String> = ArrayList()
    @SerializedName("source")
    val source:String=""
}