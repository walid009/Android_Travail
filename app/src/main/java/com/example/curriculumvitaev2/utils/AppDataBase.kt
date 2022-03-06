package com.example.curriculumvitaev2.utils

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.curriculumvitaev2.dao.ExperienceDao
import com.example.curriculumvitaev2.data.Experience

@Database(entities = [Experience::class], version = 1, exportSchema = false)
abstract class AppDataBase: RoomDatabase()  {
    abstract fun  experienceDao(): ExperienceDao

    companion object {
        @Volatile
        private var instance: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            if (instance == null) {
                synchronized(this) {
                    //TODO 8.2 "Build the DataBase"
                    instance = Room.databaseBuilder(context, AppDataBase::class.java, "db_experiences")
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return instance!!
        }
    }
}