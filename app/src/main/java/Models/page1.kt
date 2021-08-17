package Models

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class page1 {
    @SerializedName("Education")
    val Education:ArrayList<Edu> = ArrayList()
    class Edu{
        @SerializedName("name")
        val name:String=""
        @SerializedName("duration")
        val duration:String=""
        @SerializedName("fields")
        val field:ArrayList<fields> = ArrayList()
    }
    class fields{
        @SerializedName("name")
        val name:String=""
        @SerializedName("subFields")
        val subFields:ArrayList<String> = ArrayList()
    }
    @SerializedName("GovtJobs")
    val GovtJobs:ArrayList<String> = ArrayList()


}