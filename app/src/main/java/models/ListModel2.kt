package models
import com.google.gson.annotations.SerializedName

class ListModel2 {

    @SerializedName("data")
    val data : ArrayList<Model2> = ArrayList()

}

class Model2 {

    @SerializedName("name")
    val name : String =""

    @SerializedName("degree")
    val degree : ArrayList<Degree> = ArrayList()
}

class Degree{

    @SerializedName("course")
    val course : String =""
    @SerializedName("eligibility")
    val eligibility : String = ""
    @SerializedName("duration")
    val duration : String =""
    @SerializedName("fields")
    val fields : ArrayList<String> = ArrayList()
}