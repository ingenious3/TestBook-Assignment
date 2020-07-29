package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Count(
    @SerializedName("Doubt Class")
    val doubtClass: Int = 0,
    @SerializedName("Live Class")
    val liveClass: Int = 0,
    @SerializedName("Notes")
    val notes: Int = 0,
    @SerializedName("Practice")
    val practice: Int = 0,
    @SerializedName("Quiz")
    val quiz: Int = 0,
    @SerializedName("Test")
    val test: Int = 0,
    @SerializedName("Video")
    val video: Int = 0
)