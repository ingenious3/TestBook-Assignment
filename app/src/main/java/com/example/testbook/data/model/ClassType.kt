package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class ClassType(
    @SerializedName("classFrom")
    val classFrom: String = "",
    @SerializedName("classTill")
    val classTill: String = "",
    @SerializedName("lastEnrollmentDate")
    val lastEnrollmentDate: String = "",
    @SerializedName("type")
    val type: String = ""
)