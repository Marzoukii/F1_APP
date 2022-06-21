package com.example.f1_app.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.f1_app.R
import com.example.f1_app.model.Pilote

class PiloteViewModel : ViewModel(){
    private var _pilotes=MutableLiveData<List<Pilote>>()
    val pilotes: LiveData<List<Pilote>> = _pilotes

    fun getPilotes(){
        val list= mutableListOf<Pilote>()
        list.add(
            Pilote(
                1,
                R.drawable.f1,
                "Max Verstappen",
                "Red Bull Racing Honda"
        ))
        list.add(
            Pilote(
                2,
                R.drawable.f2,
                "Lewis Hamilton",
                "Mercedes"
            ))
        list.add(
            Pilote(
                3,
                R.drawable.f3,
                "Valtteri Bottas",
                "Mercedes"
            ))
        list.add(
            Pilote(
                4,
                R.drawable.f4,
                "Carlos Sainz",
                "Ferrari"
            ))
        list.add(
            Pilote(
                5,
                R.drawable.f5,
                "Lando Norris",
                "Mclaren Mercedes"
            ))
        list.add(
            Pilote(
                6,
                R.drawable.f6,
                "Lando Norris",
                "Mclaren Mercedes"
            ))
        list.add(
            Pilote(
                7,
                R.drawable.f7,
                "Charles Leclerc",
                "Ferrari"
            ))
        list.add(
            Pilote(
                8,
                R.drawable.f8,
                "Daniel Ricciardo",
                "Mclaren Mercedes"
            ))
        list.add(
            Pilote(
                9,
                R.drawable.f9,
                "Pierre Gasly",
                "Alphatauri Honda"
            ))
        list.add(
            Pilote(
                10,
                R.drawable.f10,
                "Fernando Alonso",
                "Alpine Renault"
            ))
        _pilotes.value=list
    }
}