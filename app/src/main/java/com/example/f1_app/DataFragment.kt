package com.example.f1_app

import com.example.f1_app.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.f1_app.adapter.MainAdapter
import com.example.f1_app.databinding.FragmentDataBinding
import com.example.f1_app.model.Pilote
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class DataFragment : Fragment() {

    private  var _binding: FragmentDataBinding? = null
    private val binding get() = _binding!!
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
        _binding = FragmentDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var first = arguments?.getString("firstname")
        var last = arguments?.getString("lastname")

        binding.nom.text =first.toString()
        binding.Prenom.text=last.toString()
        val adapter = MainAdapter(listOf())

        binding.recy.adapter = adapter
        binding.progress.visibility = View.VISIBLE
        GlobalScope.launch(Dispatchers.Main) {


            binding.progress.visibility = View.GONE

            adapter.items = listPilote
            adapter.notifyDataSetChanged()


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}