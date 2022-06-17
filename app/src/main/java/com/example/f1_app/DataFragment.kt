package com.example.f1_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.f1_app.adapter.MainAdapter
import com.example.f1_app.model.Pilote
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_data.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class DataFragment : Fragment() {
    val listPilote = mutableListOf(
        Pilote(
            1,
            R.drawable.f1,
            "Max Verstappen",
            "Red Bull Racing Honda"
        ),
        Pilote(
            2,
            R.drawable.f2,
            "Lewis Hamilton",
            "Mercedes"
        ),
        Pilote(
            3,
            R.drawable.f3,
            "Valtteri Bottas",
            "Mercedes"
        ),
        Pilote(
            4,
            R.drawable.f4,
            "Carlos Sainz",
            "Ferrari"
        ),
        Pilote(
            5,
            R.drawable.f5,
            "Lando Norris",
            "Mclaren Mercedes"
        ),
        Pilote(
            6,
            R.drawable.f6,
            "Lando Norris",
            "Mclaren Mercedes"
        ),
        Pilote(
            7,
            R.drawable.f7,
            "Charles Leclerc",
            "Ferrari"
        ),
        Pilote(
            8,
            R.drawable.f8,
            "Daniel Ricciardo",
            "Mclaren Mercedes"
        ),
        Pilote(
            9,
            R.drawable.f9,
            "Pierre Gasly",
            "Alphatauri Honda"
        ),
        Pilote(
            10,
            R.drawable.f10,
            "Fernando Alonso",
            "Alpine Renault"
        ),
    )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view= inflater.inflate(R.layout.fragment_data, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var first = arguments?.getString("firstname")
        var last = arguments?.getString("lastname")

        nom.text=first.toString()
        Prenom.text=last.toString()
        val adapter = MainAdapter(listOf())

        recy.adapter = adapter
        progress.visibility = View.VISIBLE
        GlobalScope.launch(Dispatchers.Main) {


            progress.visibility = View.GONE

            adapter.items = listPilote
            adapter.notifyDataSetChanged()


        }
    }

}