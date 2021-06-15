package com.example.bestpracticesmvi.ui.state

import com.example.bestpracticesmvi.models.PostItem

data class MainViewState(

    var posts: MutableList<PostItem>? = null
//    var user: User? = null

)