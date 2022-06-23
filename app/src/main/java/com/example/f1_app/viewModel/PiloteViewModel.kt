package com.example.f1_app.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.f1_app.R
import com.example.f1_app.model.Pilote
import com.example.f1_app.repository.Repository

class PiloteViewModel : ViewModel(){

    private val repository= Repository()
    private val _pilotes=MutableLiveData<List<Pilote>>()
  //  val pilotes: LiveData<List<Pilote>> = _pilotes


    fun getPilotesCurrent(){
         _pilotes.postValue(repository.getCurrentPilotes())
       // _pilotes.value=list
    }
}