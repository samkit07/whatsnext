package models

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class ListModel2 {

    @SerializedName("data")
    val data : ArrayList<Model2> = ArrayList()

    override fun toString(): String {
        return "$data"
    }


}

class Model2 {

    @SerializedName("name")
    val name : String =""
    @SerializedName("duration")
    val duration : String =""
    @SerializedName("eligibility")
    val eligibility : String = ""
    @SerializedName("entranceExams")
    val entranceExams : ArrayList<String> = ArrayList()

    @SerializedName("fields")
    val fields : ArrayList<Fields2> = ArrayList()
    override fun toString(): String {
        return "$name \n $duration \n $eligibility \n $entranceExams \n $fields"
    }


}

class Fields2{

    @SerializedName("name")
    val name : String =""
    @SerializedName("duration")
    val duration : String =""
    @SerializedName("entranceExams")
    val entranceExams : ArrayList<String> = ArrayList()
    @SerializedName("subFields")
    val subFields : ArrayList<SubFields> = ArrayList()
    @SerializedName("applicablePost")
    val applicablePost : String = ""
    @SerializedName("examination")
    val examination : ArrayList<Examinations> = ArrayList()

    override fun toString(): String {
        return "$name \n $duration \n $entranceExams \n $subFields \n $applicablePost \n $examination"
    }

}

class SubFields{
    @SerializedName("name")
    val name : String =""
    @SerializedName("specialization")
    val specialization : ArrayList<String> = ArrayList()

    override fun toString(): String {
        return "$name \n $specialization"
    }

}

class Examinations{

    @SerializedName("name")
    val name : String =""
    @SerializedName("eligibility")
    val eligibility : String = ""
    @SerializedName("duration")
    val duration : String =""
    override fun toString(): String {
        return "$name \n $eligibility \n $duration"
    }


}