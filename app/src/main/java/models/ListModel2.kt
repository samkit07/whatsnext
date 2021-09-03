package models

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class ListModel2 {

    @SerializedName("data")
    val data: ArrayList<Model2> = ArrayList()

//    override fun toString(): String {
//        return "$data"
//    }


}

class Model2 {

    var expandable: Boolean = false

    @SerializedName("type")
    val type: String = ""

    @SerializedName("name")
    val name: String = ""

    @SerializedName("duration")
    val duration: String = ""

    @SerializedName("eligibility")
    val eligibility: String = ""

    @SerializedName("fields")
    val fields2: ArrayList<String> = ArrayList()

    override fun toString(): String {
        return "$type \n $name \n $duration \n $eligibility \n $fields2"
    }

//    @SerializedName("exams")
//    val exams: ArrayList<Examinations2> = ArrayList()

}

//class Fields2 {
//
//    @SerializedName("name")
//    val name: String = ""
//
//    @SerializedName("type")
//    val type: String = ""
//
//    @SerializedName("duration")
//    val duration: String = ""
//
//    @SerializedName("exams")
//    val exams: ArrayList<Examinations2> = ArrayList()
//
//    @SerializedName("applicablePost")
//    val applicablePost: String = ""
//
//    @SerializedName("subFields")
//    val subfields: ArrayList<String> = ArrayList()
//
//    override fun toString(): String {
//        return "$name \n $type \n $duration \n $exams \n $applicablePost \n $subfields"
//    }
//
//}



//class Examinations2 {
//
//    @SerializedName("name")
//    val name: String = ""
//
//    @SerializedName("purpose")
//    val purpose: String = ""
//
//    @SerializedName("eligibility")
//    val eligibility: String = ""
//
//    @SerializedName("applicationMode")
//    val applicationMode: String = ""
//
//    @SerializedName("duration")
//    val duration: String = ""
//
//    @SerializedName("source")
//    val source: String = ""
//
//    @SerializedName("activity-")
//    val activity: String = ""
//
//    @SerializedName("schools")
//    val schools: ArrayList<Schools2> = ArrayList()
//
//    override fun toString(): String {
//        return "$name \n $purpose \n $eligibility \n $applicationMode \n $duration \n $source \n $activity \n $schools"
//    }
//}