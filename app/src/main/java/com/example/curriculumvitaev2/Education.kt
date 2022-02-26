package com.example.curriculumvitaev2

import androidx.annotation.DrawableRes


data class Education(

    @DrawableRes
    val educationPic: Int,

    val educationD1: String,

    val educationD2: String,

    val educationUniversity: String,

    val educationPays: String,
)