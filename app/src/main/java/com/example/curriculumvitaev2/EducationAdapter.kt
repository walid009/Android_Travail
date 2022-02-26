package com.example.curriculumvitaev2
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EducationAdapter(val championsList: MutableList<Education>): RecyclerView.Adapter<EducationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_row_education, parent, false)
        return  EducationViewHolder(view)
    }

    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {
        val d1 = championsList[position].educationD1
        val d2 = championsList[position].educationD2
        val university = championsList[position].educationUniversity
        val pays = championsList[position].educationPays

        holder.educationPic.setImageResource(championsList[position].educationPic)
        holder.educationD1.text = d1
        holder.educationD2.text = d2
        holder.educationUniversity.text = university
        holder.educationPays.text = pays
    }

    override fun getItemCount(): Int {
        return  championsList.size
    }

}