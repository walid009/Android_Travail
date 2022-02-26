package com.example.curriculumvitaev2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExperienceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val experiencePic : ImageView
    val experienceD1 : TextView
    val experienceD2 : TextView
    val experienceDescription : TextView

    init {
        experiencePic = itemView.findViewById<ImageView>(R.id.imageViewExperience)
        experienceD1 = itemView.findViewById<TextView>(R.id.textViewExperienceDate1)
        experienceD2 = itemView.findViewById<TextView>(R.id.textViewExperienceDate2)
        experienceDescription = itemView.findViewById<TextView>(R.id.textViewExperienceDescription)
    }

}