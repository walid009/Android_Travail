package com.example.curriculumvitaev2

import androidx.annotation.DrawableRes


data class Experience(

    @DrawableRes
    val experiencePic: Int,

    val experienceD1: String,

    val experienceD2: String,

    val experienceDescription: String,
)