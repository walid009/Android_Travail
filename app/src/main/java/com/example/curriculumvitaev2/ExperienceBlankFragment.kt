package com.example.curriculumvitaev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ExperienceBlankFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_experience_blank, container, false)
    }

    lateinit var recyclerExperienceView: RecyclerView
    lateinit var recyclerExperienceAdapter: ExperienceAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerExperienceView = view.findViewById(R.id.recyclerExperience)

        var champList : MutableList<Experience> = ArrayList()
        champList.add(Experience(experiencePic = R.drawable.ic_logo_amazon, experienceD1 = "01/09/2020", experienceD2 = "today",experienceDescription = "MASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTER"))
        champList.add(Experience(experiencePic = R.drawable.ic_logo_facebook, experienceD1 = "01/09/2020", experienceD2 = "today",experienceDescription = "MASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTER"))
        champList.add(Experience(experiencePic = R.drawable.ic_logo_esprit, experienceD1 = "01/09/2020", experienceD2 = "today",experienceDescription = "MASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTER"))
        champList.add(Experience(experiencePic = R.drawable.ic_logo_microsoft, experienceD1 = "01/09/2020", experienceD2 = "today",experienceDescription = "MASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTERMASHCHUSTTER"))

        recyclerExperienceAdapter = ExperienceAdapter(champList)
        recyclerExperienceView.adapter = recyclerExperienceAdapter

        recyclerExperienceView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
    }

    companion object {
    }
}