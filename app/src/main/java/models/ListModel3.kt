package models

import com.google.gson.annotations.SerializedName

class ListModel3 {

    @SerializedName("data")
    val data : ArrayList<Model3> = ArrayList()
}

class Model3{

    @SerializedName("studentType")
    val studentType : String = ""
    @SerializedName("whatNext")
    val whatNext : ArrayList<String> = ArrayList()



}