package com.example.bestpracticesmvi.ui.state

sealed class MainStateEvent {

    class GetPostItemsEvent: MainStateEvent()
    class GetCommentsCountEvent: MainStateEvent()
    class None: MainStateEvent()

}