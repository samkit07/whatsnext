package Models

import com.google.gson.annotations.SerializedName

class listpage3 {
    @SerializedName("data")
    val data : ArrayList<page3> = ArrayList()
}

class page3{

    @SerializedName("studentType")
    val studentType : String = ""
    @SerializedName("whatNext")
    val whatNext: ArrayList<String> = ArrayList()
}