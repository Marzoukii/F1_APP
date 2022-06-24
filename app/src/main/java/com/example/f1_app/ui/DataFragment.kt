package com.example.f1_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.f1_app.adapter.MainAdapter
import com.example.f1_app.databinding.FragmentDataBinding
import com.example.f1_app.viewModel.PiloteViewModel


class DataFragment : Fragment() {

    private  var _binding: FragmentDataBinding? = null
    private val binding get() = _binding!!


private lateinit var piloteViewModel: PiloteViewModel
private lateinit var linearLayoutManager: LinearLayoutManager
private val mainAdapter by lazy {
   MainAdapter()
}

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

        piloteViewModel=ViewModelProvider(this).get(PiloteViewModel::class.java)
        linearLayoutManager= LinearLayoutManager(this.context, RecyclerView.VERTICAL, false);

        piloteViewModel=ViewModelProvider(this).get(PiloteViewModel::class.java)

        var first = arguments?.getString("firstname")
        var last = arguments?.getString("lastname")

        binding.recy.apply {
layoutManager=linearLayoutManager
            adapter=mainAdapter
        }
        piloteViewModel.getPilotesCurrent()

        piloteViewModel.pilotes.observe(this, Observer {
            mainAdapter.submitList(it)
        })
        binding.nom.text =first.toString()
        binding.Prenom.text=last.toString()
       /* val adapter = MainAdapter(listOf())

        binding.recy.adapter = adapter
        binding.progress.visibility = View.VISIBLE
        GlobalScope.launch(Dispatchers.Main) {


            binding.progress.visibility = View.GONE

            adapter.items = listPilote
            adapter.notifyDataSetChanged()*/


        }
    }



