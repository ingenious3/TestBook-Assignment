package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Curriculum(
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("title")
    val title: Any = Any(),
    @SerializedName("url")
    val url: Any = Any()
)