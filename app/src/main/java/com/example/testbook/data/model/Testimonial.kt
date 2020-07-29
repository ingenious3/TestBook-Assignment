package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Testimonial(
    @SerializedName("image")
    val image: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("rating")
    val rating: Double = 0.0,
    @SerializedName("review")
    val review: String = ""
)