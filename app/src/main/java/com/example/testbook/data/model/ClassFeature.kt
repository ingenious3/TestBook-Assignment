package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class ClassFeature(
    @SerializedName("features")
    val features: List<Feature> = listOf(),
    @SerializedName("text")
    val text: String = ""
)