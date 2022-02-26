package com.example.curriculumvitaev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationBlankFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_education_blank, container, false)
    }

    lateinit var recyclerEducationView: RecyclerView
    lateinit var recyclerEducationAdapter: EducationAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerEducationView = view.findViewById(R.id.recyclerEducation)

        var champList : MutableList<Education> = ArrayList()
        champList.add(Education(educationPic = R.drawable.ic_logo_massachusetts, educationD1 = "01/09/2020", educationD2 = "today",educationUniversity = "MASHCHUSTTER",educationPays = "UNited States"))
        champList.add(Education(educationPic = R.drawable.ic_logo_oxford, educationD1 = "01/09/2020", educationD2 = "today",educationUniversity = "MASHCHUSTTER",educationPays = "UNited States"))
        champList.add(Education(educationPic = R.drawable.ic_logo_stanford, educationD1 = "01/09/2020", educationD2 = "today",educationUniversity = "MASHCHUSTTER",educationPays = "UNited States"))
        champList.add(Education(educationPic = R.drawable.ic_logo_cambridge, educationD1 = "01/09/2020", educationD2 = "today",educationUniversity = "MASHCHUSTTER",educationPays = "UNited States"))

        recyclerEducationAdapter = EducationAdapter(champList)
        recyclerEducationView.adapter = recyclerEducationAdapter

        recyclerEducationView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
    }

    companion object {}
}