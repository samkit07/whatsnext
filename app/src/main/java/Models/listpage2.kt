package Models

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class listpage2 {

    @SerializedName("data")
    val data : ArrayList<Model2> = ArrayList()

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

}

class SubFields{
    @SerializedName("name")
    val name : String =""
    @SerializedName("specialization")
    val specialization : ArrayList<String> = ArrayList()

}

class Examinations{

    @SerializedName("name")
    val name : String =""
    @SerializedName("eligibility")
    val eligibility : String = ""
    @SerializedName("duration")
    val duration : String =""

}