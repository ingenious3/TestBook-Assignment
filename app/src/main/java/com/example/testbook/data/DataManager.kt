package com.example.testbook.data

import androidx.paging.PageKeyedDataSource
import com.example.testbook.data.model.Class
import com.example.testbook.data.model.Response
import com.example.testbook.network.ApiInterface
import com.example.testbook.network.ApiService
import retrofit2.Call
import retrofit2.Callback

class DataManager : PageKeyedDataSource<Int, Class>() {

    private var pageOffset :Int = 0

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Class>) {
        val service = ApiService.buildApiService(ApiInterface::class.java)
        val call = service.getCourses(true, true)
        call.enqueue(object : Callback<Response> {
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                if (response.isSuccessful) {
                    val apiResponse = response.body()!!
                    val responseItems = apiResponse.data.classes
                    val key = if (params.key > 1) params.key - 1 else 0
                    responseItems?.let {
                        callback.onResult(responseItems, key)
                    }
                }
            }
            override fun onFailure(call: Call<Response>, t: Throwable) {
            }
        })
    }
    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, Class>) {
        val service = ApiService.buildApiService(ApiInterface::class.java)
        val call = service.getCourses(true, true)
        call.enqueue(object : Callback<Response> {
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                if (response.isSuccessful) {
                    val apiResponse = response.body()!!
                    val responseItems = apiResponse.data.classes
                    responseItems?.let {
                        callback.onResult(responseItems, null, pageOffset)
                    }
                }
            }
            override fun onFailure(call: Call<Response>, t: Throwable) {
            }
        })
    }
    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Class>) {
        val service = ApiService.buildApiService(ApiInterface::class.java)
        val call = service.getCourses(true, true)
        call.enqueue(object : Callback<Response> {
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                if (response.isSuccessful) {
                    val apiResponse = response.body()!!
                    val responseItems = apiResponse.data.classes
                    responseItems?.let {
                        callback.onResult(responseItems, pageOffset)
                    }
                }
            }
            override fun onFailure(call: Call<Response>, t: Throwable) {
            }
        })
    }
}