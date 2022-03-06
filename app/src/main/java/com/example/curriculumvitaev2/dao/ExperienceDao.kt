package com.example.curriculumvitaev2.dao
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.curriculumvitaev2.data.Experience

@Dao
interface ExperienceDao {
    @Insert
    fun insert(c: Experience)
    @Delete
    fun delete(c: Experience)
    @Query("SELECT * FROM Experience")
    fun getAll(): MutableList<Experience>
}