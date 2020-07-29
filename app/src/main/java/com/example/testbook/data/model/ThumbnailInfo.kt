package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class ThumbnailInfo(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("url")
    val url: String = ""
)