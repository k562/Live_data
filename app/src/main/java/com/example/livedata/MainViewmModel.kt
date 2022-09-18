package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewmModel : ViewModel() {

   private val factsLivedataobject = MutableLiveData<String>("This is a fact")

    val factsLiveData : LiveData<String>
    get() = factsLivedataobject

    fun updateLiveData(){
        factsLivedataobject.value = "This is a new fact"
    }
}