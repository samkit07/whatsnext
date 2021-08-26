package models

import android.text.TextUtils.replace
import android.util.Log
import com.google.gson.annotations.SerializedName

class ListModel1 {

    @SerializedName("data")
    val data : ArrayList<Model1> = ArrayList()

    override fun toString(): String {
        return "$data"
    }
}

//class Model1 {
//
//    @SerializedName("name")
//    val Education : ArrayList<Education> = ArrayList()
//    @SerializedName("GovtJobs")
//    val GovtJobs : ArrayList<GovtJobs> = ArrayList()
//    override fun toString(): String {
//        return "$Education \n $GovtJobs"
//    }


//}
//Education
class Model1{

    @SerializedName("name")
    val name : String = ""
    @SerializedName("type")
    val type :  String = ""
    @SerializedName("jobs")
    val jobs : String = ""
    @SerializedName("duration")
    val duration : String = ""
    @SerializedName("fields")
    val fields : ArrayList<Fields> = ArrayList()
    @SerializedName("examinations")
    val examinations : ArrayList<Examinations1> = ArrayList()
    override fun toString(): String {
        return "$name \n $type \n $jobs \n $duration \n $fields \n $examinations"
    }

}

class Examinations1{

    @SerializedName("name")
    val name : String = ""
    @SerializedName("website")
    val website : String = ""

    override fun toString(): String {
        return "$name \n $website"
    }
}

class Fields {

    @SerializedName("name")
    val name :  String = ""
    @SerializedName("subFields")
    val subFields : ArrayList<String> = ArrayList()

    override fun toString(): String {
        return "$name \n $subFields"
    }

}
