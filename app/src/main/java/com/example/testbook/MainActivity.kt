package com.example.testbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testbook.adapter.CourseAdapter
import com.example.testbook.data.viewmodel.CourseViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CourseAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)
        val itemViewModel = ViewModelProviders.of(this)
            .get(CourseViewModel::class.java)
        itemViewModel.coursePagedList.observe(this, Observer {
            adapter.submitList(it)
        })
        recyclerView.adapter = adapter

    }
}