package com.example.roomdbexample.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.roomdbexample.db.SubscriberRepository
import com.example.roomdbexample.viewmodels.SubscriberViewModel
import java.lang.IllegalArgumentException

class SubscriberViewModelFactory(private val repository: SubscriberRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SubscriberViewModel::class.java)){
            return SubscriberViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown View Model class")
    }

}