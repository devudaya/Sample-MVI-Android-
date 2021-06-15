package com.codingwithmitch.mviexample.api

import androidx.lifecycle.LiveData
import com.codingwithmitch.mviexample.util.GenericApiResponse
import com.example.bestpracticesmvi.models.CommentItem
import com.example.bestpracticesmvi.models.PostItem
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

//    @GET("placeholder/blogs")
//    fun getBlogPosts(): LiveData<GenericApiResponse<List<BlogPost>>>
//
//    @GET("placeholder/user/{userId}")
//    fun getUser(
//        @Path("userId") userId: String
//    ): LiveData<GenericApiResponse<User>>

    @GET("posts")
    fun getPosts(): LiveData<GenericApiResponse<MutableList<PostItem>>>

    @GET("posts/{id}/comments")
    fun getComments(
        @Path("id") id: Int
    ): LiveData<GenericApiResponse<MutableList<CommentItem>>>
}