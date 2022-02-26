package com.example.curriculumvitaev2.ui.theme

import androidx.annotation.DrawableRes

const val PICTURE_EDUCATION = "PICTURE_EDUCATION"
const val DATE1 = "DATE1"
const val DATE2 = "DATE2"
const val UNEVERSITY = "Uneversity"
const val PAYS = "DATE2"

data class Education(

    @DrawableRes
    val EducationPic: Int,

    val EducationDate1: String,

    val EducationDate2: String,

    val EducationUnversirty: String,

    val EducationPays: String
)