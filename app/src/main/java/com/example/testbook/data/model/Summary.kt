package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Summary(
    @SerializedName("module")
    val module: Module = Module(),
    @SerializedName("rating")
    val rating: Rating = Rating()
)