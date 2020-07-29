package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class Class(
    @SerializedName("affiliateAttributionPaused")
    val affiliateAttributionPaused: Boolean = false,
    @SerializedName("availTill")
    val availTill: String = "",
    @SerializedName("classInfo")
    val classInfo: ClassInfo = ClassInfo(),
    @SerializedName("classProperties")
    val classProperties: ClassProperties = ClassProperties(),
    @SerializedName("coachingName")
    val coachingName: String = "",
    @SerializedName("cost")
    val cost: Int = 0,
    @SerializedName("costUpfront")
    val costUpfront: Boolean = false,
    @SerializedName("course")
    val course: Course = Course(),
    @SerializedName("courseLogo")
    val courseLogo: String = "",
    @SerializedName("courses")
    val courses: List<Course> = listOf(),
    @SerializedName("createdOn")
    val createdOn: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("descriptions")
    val descriptions: Any = Any(),
    @SerializedName("discountText")
    val discountText: String = "",
    @SerializedName("doubtTag")
    val doubtTag: DoubtTag = DoubtTag(),
    @SerializedName("extraFeatures")
    val extraFeatures: Any = Any(),
    @SerializedName("features")
    val features: Any = Any(),
    @SerializedName("freeTestCount")
    val freeTestCount: Int = 0,
    @SerializedName("_id")
    val id: String = "",
    @SerializedName("isClassCombo")
    val isClassCombo: Boolean = false,
    @SerializedName("isCuratedTopic")
    val isCuratedTopic: Boolean = false,
    @SerializedName("isCustom")
    val isCustom: Boolean = false,
    @SerializedName("isDemoModuleAvail")
    val isDemoModuleAvail: Boolean = false,
    @SerializedName("isHidden")
    val isHidden: Boolean = false,
    @SerializedName("isOffer")
    val isOffer: Boolean = false,
    @SerializedName("isPremium")
    val isPremium: Boolean = false,
    @SerializedName("isRecommended")
    val isRecommended: Boolean = false,
    @SerializedName("items")
    val items: Any = Any(),
    @SerializedName("lastFreezedOn")
    val lastFreezedOn: String = "",
    @SerializedName("lastUpdatedOn")
    val lastUpdatedOn: String = "",
    @SerializedName("minCost")
    val minCost: Int = 0,
    @SerializedName("minPrice")
    val minPrice: Int = 0,
    @SerializedName("numPurchased")
    val numPurchased: Int = 0,
    @SerializedName("offerEnd")
    val offerEnd: String = "",
    @SerializedName("offerStart")
    val offerStart: String = "",
    @SerializedName("oldCost")
    val oldCost: Int = 0,
    @SerializedName("postNote")
    val postNote: Any = Any(),
    @SerializedName("publishCompleted")
    val publishCompleted: Boolean = false,
    @SerializedName("quantity")
    val quantity: Int = 0,
    @SerializedName("recommendedFor")
    val recommendedFor: String = "",
    @SerializedName("releaseDate")
    val releaseDate: String = "",
    @SerializedName("shortDesc")
    val shortDesc: Any = Any(),
    @SerializedName("showSyllabus")
    val showSyllabus: Boolean = false,
    @SerializedName("slugUrl")
    val slugUrl: String = "",
    @SerializedName("specificExams")
    val specificExams: List<SpecificExam> = listOf(),
    @SerializedName("stage")
    val stage: String = "",
    @SerializedName("stopEvents")
    val stopEvents: Boolean = false,
    @SerializedName("summary")
    val summary: Summary = Summary(),
    @SerializedName("target")
    val target: List<Target> = listOf(),
    @SerializedName("targetSuperGroup")
    val targetSuperGroup: List<TargetSuperGroup> = listOf(),
    @SerializedName("thumbnailInfo")
    val thumbnailInfo: ThumbnailInfo = ThumbnailInfo(),
    @SerializedName("title")
    val title: String = "",
    @SerializedName("titles")
    val titles: String = "",
    @SerializedName("type")
    val type: String = "",
    @SerializedName("weight")
    val weight: Int = 0
)