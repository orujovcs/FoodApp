package com.example.myfoodapp.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Food(@SerializedName("yemek_id") var yemek_id : Int,
                @SerializedName("yemek_adi") var yemek_adi : String,
                @SerializedName("yemek_resim_adi") var yemek_resim_adi : String,
                @SerializedName("yemek_fiyat") var yemek_fiyat : Int,
                var yemek_adet : Int = 0) : Serializable {
}