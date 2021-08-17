package Models

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class page8 {
    @SerializedName("name")
    val name:String=""
    @SerializedName("purpose")
    val purpose:String=""
    @SerializedName("applicationMode")
    val applicationMode:String=""
    @SerializedName("activity")
    val activity:String=""
    @SerializedName("source")
    val source:String=""
    @SerializedName("schools")
    val school:ArrayList<schools> = ArrayList()
    class schools{
        @SerializedName("id")
        val id:Int=0
        @SerializedName("name")
        val name:String=""
        @SerializedName("website")
        val website:String=""

    }
}