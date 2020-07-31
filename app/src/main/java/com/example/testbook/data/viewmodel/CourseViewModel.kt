package com.example.testbook.data.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.testbook.data.DataManager
import com.example.testbook.data.DataSourceFactory
import com.example.testbook.data.model.Class

class CourseViewModel : ViewModel() {
    var coursePagedList: LiveData<PagedList<Class>>
    private var liveDataManager: LiveData<DataManager>
    init {
        val itemDataSourceFactory = DataSourceFactory()
        liveDataManager = itemDataSourceFactory.dataSource
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(1)
            .build()
        coursePagedList = LivePagedListBuilder(itemDataSourceFactory, config)
            .build()
    }
}