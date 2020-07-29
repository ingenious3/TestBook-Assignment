package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("curTime")
    val curTime: String = "",
    @SerializedName("data")
    val `data`: Data = Data(),
    @SerializedName("success")
    val success: Boolean = false
)