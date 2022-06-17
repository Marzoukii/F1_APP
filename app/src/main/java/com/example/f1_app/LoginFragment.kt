package com.example.f1_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.f1_app.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    private  var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private  var res = false
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

                   if(verifUserInput()) {


                       //  val intent = Intent(this, MainActivity::class.java)

                       val bundle = bundleOf(
                           "firstname" to txtfirstname.text.toString(),
                           "lastname" to txtlastname.text.toString()
                       )

                       NavHostFragment.findNavController(this)
                           .navigate(R.id.action_loginFragment_to_dataFragment, bundle)
                       //  intent.putExtra("firstname", txtfirstname.text.toString())
                       //  intent.putExtra("lastname", txtlastname.text.toString())
                       //  startActivity(intent)
                   }
            }
        }
    private fun verifUserInput():Boolean{

        if (binding.txtfirstname.text.isEmpty() ) {

            binding.txtfirstname.error = "Please specify your first name "
            return false
        }
        if (binding.txtlastname.text.isEmpty()) {

            binding.txtlastname.error = "Please specify your last name"
            return false
        }
        if(binding.txtfirstname.text.matches("^(?=.*[_.()$&@*+#£?!;-]).*$".toRegex())){

            binding.txtfirstname.error = "Special characters are forbidden"
            return false
        }

       if(binding.txtlastname.text.matches("^(?=.*[_.()$&@*+#£?!;-]).*$".toRegex())){

            binding.txtlastname.error = "Special characters are forbidden"
            return false
        }
        if(binding.txtlastname.text.matches("(.*[0-9].*)".toRegex())){

            binding.txtlastname.error = "Numbers are forbidden"
            return false
        }
        if(binding.txtfirstname.text.matches("(.*[0-9].*)".toRegex())){

            binding.txtfirstname.error = "Numbers are forbidden"
            return false
        }

        return true
    }
    }

