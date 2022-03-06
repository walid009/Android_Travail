package com.example.curriculumvitaev2.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val NAME = "NAME"
const val ADDRESS = "ADDRESS"
const val D1 = "D1"
const val D2 = "D2"

@Entity(tableName = "experience")
data class Experience(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val expPic: Int,

    val expName: String,

    val expAddress: String,

    val expD1: String,

    val expD2: String

)