package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Target(
    @SerializedName("_id")
    val id: String = "",
    @SerializedName("isPrimary")
    val isPrimary: Boolean = false,
    @SerializedName("title")
    val title: String = ""
)