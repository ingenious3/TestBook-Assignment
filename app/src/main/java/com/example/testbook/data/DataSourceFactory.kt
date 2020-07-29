package com.example.testbook.data

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.example.testbook.data.model.Class

class DataSourceFactory : DataSource.Factory<Int, Class>() {

    val dataSource = MutableLiveData<DataManager>()

    override fun create(): DataSource<Int, Class> {
        val dataManager = DataManager()
        dataSource.postValue(dataManager)
        return dataManager
    }
}