package com.example.bestpracticesmvi.repository

import androidx.lifecycle.LiveData
import com.codingwithmitch.mviexample.repository.NetworkBoundResource
import com.codingwithmitch.mviexample.util.ApiSuccessResponse
import com.codingwithmitch.mviexample.util.DataState
import com.codingwithmitch.mviexample.util.GenericApiResponse
import com.example.bestpracticesmvi.models.CommentItem
import com.example.bestpracticesmvi.models.PostItem
import com.example.bestpracticesmvi.ui.state.MainViewState

object Repository {

    fun getPosts(): LiveData<DataState<MainViewState>>{

        return object : NetworkBoundResource<MutableList<PostItem>, MainViewState>(){

            override fun handleApiSuccessResponse(response: ApiSuccessResponse<MutableList<PostItem>>) {
                TODO("Not yet implemented")
            }

            override fun createCall(): LiveData<GenericApiResponse<MutableList<PostItem>>> {
                TODO("Not yet implemented")
            }

        }.asLiveData()
    }

    fun getComments(): LiveData<DataState<MainViewState>>{

        return object : NetworkBoundResource<MutableList<CommentItem>, MainViewState>(){
            override fun handleApiSuccessResponse(response: ApiSuccessResponse<MutableList<CommentItem>>) {
                TODO("Not yet implemented")
            }

            override fun createCall(): LiveData<GenericApiResponse<MutableList<CommentItem>>> {
                TODO("Not yet implemented")
            }

        }.asLiveData()
    }
}