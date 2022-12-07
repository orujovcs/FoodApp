package com.example.myfoodapp.data.entity

import com.google.gson.annotations.SerializedName


data class CartFoodResponse(@SerializedName("sepet_yemekler") var sepet_yemekler : List<CartFood>,
                            @SerializedName("success") var success : Int) {
}