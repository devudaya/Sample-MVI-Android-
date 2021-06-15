package com.example.bestpracticesmvi.models



data class
PostItem(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int,
    var comments: MutableList<CommentItem>?
)