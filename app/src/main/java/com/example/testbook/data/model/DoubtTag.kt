package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class DoubtTag(
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("type")
    val type: String = ""
)