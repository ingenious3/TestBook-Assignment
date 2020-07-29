package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Feature(
    @SerializedName("count")
    val count: Int = 0,
    @SerializedName("description")
    val description: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("showInSummary")
    val showInSummary: Boolean = false,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("type")
    val type: String = ""
)