package com.example.curriculumvitaev2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ExperienceAdapter(val championsList: MutableList<Experience>): RecyclerView.Adapter<ExperienceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_row_experience, parent, false)
        return  ExperienceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExperienceViewHolder, position: Int) {
        val d1 = championsList[position].experienceD1
        val d2 = championsList[position].experienceD2
        val description = championsList[position].experienceDescription

        holder.experiencePic.setImageResource(championsList[position].experiencePic)
        holder.experienceD1.text = d1
        holder.experienceD2.text = d2
        holder.experienceDescription.text = description
    }

    override fun getItemCount(): Int {
        return  championsList.size
    }

}