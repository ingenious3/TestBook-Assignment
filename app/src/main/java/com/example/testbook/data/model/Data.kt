package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("classes")
    val classes: List<Class> = listOf()
)