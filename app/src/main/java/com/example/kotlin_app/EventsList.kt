package com.example.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.example.kotlin_app.models.EventDesc


class EventsList : AppCompatActivity() {

    private val TAG = "EventsActivity"
//    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    lateinit var eventListObj : ArrayList<EventDesc>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events_list)

        val viewModel = ViewModelProvider(this).get(EventsViewModel::class.java)

        viewModel.getEvents()
        viewModel.myResponse.observe(this, Observer {

            for (eventId in it.data?.eventIds!!){

                val events = it.data?.events!!
                val eventObj = events.eventMap?.get(eventId)
                Log.d(TAG, events.toString())
                Log.d(TAG, it.data.toString())
//                val eventMetaId : Int = eventObj?.eventMetaId as Int
//                val eventMetas= it.data?.eventMetas
//                val eventGroupObj = eventMetas?.eventMetasMap?.get(eventMetaId)
//                Log.d(TAG, eventGroupObj.toString())
            }
        })

//        recyclerView.apply {
//            layoutManager = LinearLayoutManager(this@EventsList)
//            val decoration = DividerItemDecoration(this@EventsList, DividerItemDecoration.VERTICAL)
//            addItemDecoration(decoration)
//            recyclerViewAdapter = RecyclerViewAdapter()
//            adapter = recyclerViewAdapter
//
//        }

    }
}