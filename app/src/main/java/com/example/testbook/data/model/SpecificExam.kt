package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class SpecificExam(
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = ""
)