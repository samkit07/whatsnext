package Models
import com.google.gson.annotations.SerializedName
class listpage3 {
    @SerializedName("data")
    val data : ArrayList<page3> = ArrayList()
}

class page3{

    @SerializedName("courseName")
    val courseName : String = ""
    @SerializedName("afterGrad")
    val afterGrad : ArrayList<AfterGrad> = ArrayList()
}

class AfterGrad{

    @SerializedName("furtherStudy")
    val furtherStudy : ArrayList<FurtherStudy> = ArrayList()
    @SerializedName("work")
    val work : String = ""

}

class FurtherStudy{

    @SerializedName("name")
    val name : String = ""
    @SerializedName("eligibility")
    val eligibility : String = ""
    @SerializedName("courses")
    val courses : ArrayList<Courses> = ArrayList()
}

class Courses{

    @SerializedName("name")
    val name : String = ""
    @SerializedName("eligibility")
    val eligibility : ArrayList<String> = ArrayList()

}