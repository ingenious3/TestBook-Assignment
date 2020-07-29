package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Course(
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = ""
)