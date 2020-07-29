package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Instructor(
    @SerializedName("fullBio")
    val fullBio: String = "",
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("shortBio")
    val shortBio: String = ""
)