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
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_login, container, false)

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val login=view.findViewById<Button>(R.id.btn_login)
        login.setOnClickListener {
            if (txtfirstname.text.isEmpty() ){
                txtfirstname.error="Champ obligatoire!"

            }
            else if (txtlastname.text.isEmpty()){
                txtlastname.error="Champ obligatoire!"
            }

            else if (!txtfirstname.text.isEmpty()) {
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