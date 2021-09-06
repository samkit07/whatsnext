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
    @SerializedName("entranceExams")
    val entranceExams : ArrayList<String> = ArrayList()
    @SerializedName("degree")
    val degree : ArrayList<Degree> = ArrayList()
}

class Degree{

    @SerializedName("course")
    val course : String =""
    @SerializedName("duration")
    val duration : String =""
    @SerializedName("eligibility")
    val eligibility : String = ""
    @SerializedName("fields")
    val fields : ArrayList<String> = ArrayList()
}
