package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class ClassProperties(
    @SerializedName("classType")
    val classType: ClassType = ClassType(),
    @SerializedName("color")
    val color: String = "",
    @SerializedName("contentDuration")
    val contentDuration: Int = 0,
    @SerializedName("curriculum")
    val curriculum: Curriculum = Curriculum(),
    @SerializedName("instructors")
    val instructors: List<Instructor> = listOf(),
    @SerializedName("languageInfo")
    val languageInfo: String = "",
    @SerializedName("languagesInfo")
    val languagesInfo: String = "",
    @SerializedName("materialLangInfo")
    val materialLangInfo: String = "",
    @SerializedName("privateDiscussionUrl")
    val privateDiscussionUrl: String = "",
    @SerializedName("seatsAvailsInfo")
    val seatsAvailsInfo: String = "",
    @SerializedName("showLiveCourseTag")
    val showLiveCourseTag: Boolean = false,
    @SerializedName("subjects")
    val subjects: List<Any> = listOf()
)