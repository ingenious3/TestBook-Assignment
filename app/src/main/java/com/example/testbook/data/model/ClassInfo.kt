package com.example.testbook.data.model

import com.google.gson.annotations.SerializedName

data class ClassInfo(
    @SerializedName("classFeature")
    val classFeature: ClassFeature = ClassFeature(),
    @SerializedName("courseSellingImage")
    val courseSellingImage: String = "",
    @SerializedName("facultiesImage")
    val facultiesImage: String = "",
    @SerializedName("faqs")
    val faqs: List<List<Faq>> = listOf(),
    @SerializedName("introVideoUrl")
    val introVideoUrl: String = "",
    @SerializedName("preRequisites")
    val preRequisites: PreRequisites = PreRequisites(),
    @SerializedName("subjectWiseSyllabus")
    val subjectWiseSyllabus: SubjectWiseSyllabus = SubjectWiseSyllabus(),
    @SerializedName("testimonials")
    val testimonials: List<Testimonial> = listOf(),
    @SerializedName("whyTakeThisCourse")
    val whyTakeThisCourse: WhyTakeThisCourse = WhyTakeThisCourse()
)