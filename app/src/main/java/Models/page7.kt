package Models

import com.google.gson.annotations.SerializedName

class page7 {
    @SerializedName("Engineering Exams")
    val Engineering_exams:ArrayList<exams> = ArrayList()
    @SerializedName("Medical Exams")
    val Medical_exams:ArrayList<exams> = ArrayList()
    @SerializedName("Marine, Navy, Defence Exams")
    val Indian_force_exams:ArrayList<exams> = ArrayList()
    @SerializedName("Agriculture & Hotel Management Exams")
    val Agriculture_HM_Exams:ArrayList<exams> = ArrayList()
    class exams{
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
    @SerializedName("Law")
    val law:ArrayList<exams> = ArrayList()

}