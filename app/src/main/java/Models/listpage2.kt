package Models

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class listpage2 {

    @SerializedName("data")
    val data : ArrayList<page2> = ArrayList()

}

class page2 {

    @SerializedName("name")
    val name : String =""
    @SerializedName("eligibility")
    val eligibility : String = ""
    @SerializedName("entranceExams")
    val entranceExams : ArrayList<String> = ArrayList()
    @SerializedName("degree")
    val degree : ArrayList<Degree> = ArrayList()
}

class Degree{

    @SerializedName("course")
    val name : String =""
    @SerializedName("duration")
    val duration : String =""
    @SerializedName("fields")
    val subFields : ArrayList<String> = ArrayList()
}
