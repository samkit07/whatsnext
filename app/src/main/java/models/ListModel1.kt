package models

import com.google.gson.annotations.SerializedName

class ListModel1 {

    @SerializedName("data")
    val data : ArrayList<Model1> = ArrayList()
}

class Model1 {

    @SerializedName("GovtJobs")
    val GovtJobs : ArrayList<String> = ArrayList()
    @SerializedName("Education")
    val Education : ArrayList<Education> = ArrayList()

}
class Education{

    @SerializedName("name")
    val name : String = ""
    @SerializedName("duration")
    val duration : String = ""
    @SerializedName("fields")
    val fields : ArrayList<Fields> = ArrayList()

}

class Fields {

    @SerializedName("name")
    val name :  String = ""
    @SerializedName("subFields")
    val subFields : ArrayList<String> = ArrayList()
}