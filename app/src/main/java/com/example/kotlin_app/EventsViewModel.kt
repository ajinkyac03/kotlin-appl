package com.example.kotlin_app

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_app.models.EventsList
import com.example.kotlin_app.network.EventsNetwork
import kotlinx.coroutines.launch

class EventsViewModel : ViewModel() {

    val myResponse: MutableLiveData<EventsList> = MutableLiveData()

    fun getEvents() {
        viewModelScope.launch {
            myResponse.value = EventsNetwork.retrofit.getEventsList()
        }
    }

}