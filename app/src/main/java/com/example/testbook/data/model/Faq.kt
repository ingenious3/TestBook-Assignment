package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Faq(
    @SerializedName("answer")
    val answer: String = "",
    @SerializedName("language")
    val language: String = "",
    @SerializedName("question")
    val question: String = ""
)