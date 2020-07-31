package com.example.testbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testbook.R
import com.example.testbook.data.model.Class
import kotlinx.android.synthetic.main.list_item.view.*
import java.time.LocalDateTime
import java.time.Period

class CourseAdapter : PagedListAdapter<Class, CourseAdapter.CourseViewHolder>(COMPARATOR) {

    class CourseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val facultyImg = view.imgFaculty
        private val courseName = view.courseName
        private val notes = view.notesText
        private val ques = view.quesText
        private val vid = view.videosText
        private val startInTxt = view.startInText
        private val background = view.bg

        fun bind(obj: Class) {
            val bgType = (0..1).random()
            when(bgType) {
                0 -> background.setBackgroundResource(R.drawable.green_background)
                1 -> background.setBackgroundResource(R.drawable.blue_background)
            }

            courseName.text  = obj.titles
            for(feature in obj.classInfo.classFeature.features) {
                if("Questions".equals(feature.type)) {
                    ques.text = feature.name
                } else if("Notes".equals(feature.type)) {
                    notes.text = feature.name
                } else if("Live Class".equals(feature.type)) {
                    vid.text = feature.name
                }
            }

            val dateRelease = LocalDateTime.parse(obj.releaseDate.substring(0, obj.releaseDate.length-1))
            val dateToday = LocalDateTime.now()
            val diff = Math.abs(Period.between(dateToday.toLocalDate(), dateRelease.toLocalDate()).days)
            if(dateRelease.isBefore(dateToday)) {
                startInTxt.text = "Started "+diff+ " Days Ago"
            } else if(dateRelease.isAfter(dateToday)) {
                startInTxt.text = "Start in "+diff+" Days"
            }

            Glide.with(facultyImg.context)
                .load("http:/"+obj.classInfo.facultiesImage)
                .into(facultyImg);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = getItem(position)
        course?.let { holder.bind(it) }
    }

    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<Class>() {
            override fun areItemsTheSame(oldItem: Class, newItem: Class): Boolean =
                oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: Class, newItem: Class): Boolean =
                newItem == oldItem
        }
    }
}