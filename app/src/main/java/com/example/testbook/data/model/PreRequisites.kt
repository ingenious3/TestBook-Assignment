package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class PreRequisites(
    @SerializedName("comments")
    val comments: List<String> = listOf(),
    @SerializedName("text")
    val text: String = ""
)