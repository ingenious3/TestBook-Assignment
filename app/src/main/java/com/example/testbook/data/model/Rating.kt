package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("actual")
    val `actual`: Double = 0.0,
    @SerializedName("value")
    val value: Double = 0.0
)