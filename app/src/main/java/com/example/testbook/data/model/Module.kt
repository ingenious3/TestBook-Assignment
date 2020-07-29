package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Module(
    @SerializedName("count")
    val count: Count = Count()
)