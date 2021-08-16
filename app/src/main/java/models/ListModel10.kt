package models

import com.google.gson.annotations.SerializedName

class ListModel10 {

 @SerializedName("data")
 val data : ArrayList<Model10> = ArrayList()

}

class Model10{

 @SerializedName("name")
 val name : String = ""
 @SerializedName("courses")
 val courses : ArrayList<String> = ArrayList()

}