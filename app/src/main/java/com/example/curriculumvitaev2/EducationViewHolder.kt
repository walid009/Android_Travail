package com.example.curriculumvitaev2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EducationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val educationPic : ImageView
    val educationD1 : TextView
    val educationD2 : TextView
    val educationUniversity : TextView
    val educationPays : TextView = itemView.findViewById<TextView>(R.id.textViewPays)

    init {
        educationPic = itemView.findViewById<ImageView>(R.id.imageViewEduc)
        educationD1 = itemView.findViewById<TextView>(R.id.textViewDate1)
        educationD2 = itemView.findViewById<TextView>(R.id.textViewDate2)
        educationUniversity = itemView.findViewById<TextView>(R.id.textViewUnivesirty)
    }

}