package models

import com.google.gson.annotations.SerializedName

class ListModel3 {

    @SerializedName("data")
    val data : ArrayList<Model3> = ArrayList()
}

class Model3{

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