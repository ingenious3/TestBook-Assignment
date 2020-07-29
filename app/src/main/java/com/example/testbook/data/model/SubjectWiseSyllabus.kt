package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class SubjectWiseSyllabus(
    @SerializedName("comments")
    val comments: List<String> = listOf(),
    @SerializedName("text")
    val text: String = ""
)