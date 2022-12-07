package com.example.myfoodapp.data.entity

import com.google.gson.annotations.SerializedName

data class CRUDResponse(@SerializedName("success") var success:Int,
                        @SerializedName("message") var message:String) {
}