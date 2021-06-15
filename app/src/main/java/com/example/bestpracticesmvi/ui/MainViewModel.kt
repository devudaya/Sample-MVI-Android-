package com.example.bestpracticesmvi.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.codingwithmitch.mviexample.util.DataState
import com.example.bestpracticesmvi.repository.Repository
import com.example.bestpracticesmvi.ui.state.MainStateEvent
import com.example.bestpracticesmvi.ui.state.MainViewState
import com.example.bestpracticesmvi.util.AbsentLiveData

class MainViewModel: ViewModel() {

    private val _stateEvent: MutableLiveData<MainStateEvent> = MutableLiveData()
    private val _viewState: MutableLiveData<MainViewState> = MutableLiveData()

    val viewState: LiveData<MainViewState>
        get() = _viewState


    val dataState: LiveData<DataState<MainViewState>> = Transformations
        .switchMap(_stateEvent){stateEvent ->
            stateEvent?.let {
                handleStateEvent(stateEvent)
            }
        }

   private fun handleStateEvent(stateEvent: MainStateEvent): LiveData<DataState<MainViewState>> {
        println("DEBUG: New StateEvent detected: $stateEvent")
       return when(stateEvent){

           is MainStateEvent.GetPostItemsEvent -> {
               Repository.getPosts()
           }

           is MainStateEvent.GetCommentsCountEvent -> {
               Repository.getComments()
           }

           is MainStateEvent.None ->{
               AbsentLiveData.create()
           }
       }
    }
}