package com.dnd.sixth.lmsservice.data.model.subject

import com.google.gson.annotations.SerializedName

data class SubjectModel(
    @SerializedName("subject_nm")
    val subjectName: String,
    @SerializedName("salary")
    val salary: Number,
    @SerializedName("monthly_cnt")
    val monthlyCnt: Number,
    @SerializedName("class_time")
    val classTime: String,
    @SerializedName("class_day")
    val classDay: String,
    @SerializedName("teacher_id")
    val teacherId: Number,
    @SerializedName("color")
    val color: Number,
    @SerializedName("class_days")
    val classDays: String
)
