package com.example.f1_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.f1_app.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    private  var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.btnLogin.setOnClickListener {
            if (binding.txtfirstname.text.isEmpty() ){
                binding.txtfirstname.error="Champ obligatoire!"

            } else if (binding.txtlastname.text.isEmpty()){
                binding.txtlastname.error="Champ obligatoire!"
            } else if (!binding.txtfirstname.text.isEmpty()) {
                //  val intent = Intent(this, MainActivity::class.java)

                val bundle = bundleOf("firstname" to txtfirstname.text.toString(),"lastname" to txtlastname.text.toString())

                NavHostFragment.findNavController(this)
                    .navigate(R.id.action_loginFragment_to_dataFragment,bundle)
                //  intent.putExtra("firstname", txtfirstname.text.toString())
                //  intent.putExtra("lastname", txtlastname.text.toString())
                //  startActivity(intent)

            }
        }

    }

}