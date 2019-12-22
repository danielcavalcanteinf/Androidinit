package com.example.clientesapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.clientesapp.R
import kotlinx.android.synthetic.main.fragment_lista_clientes.*

class ListaClientesFragment : Fragment() {

    lateinit var viewModel: ListaClientesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lista_clientes, container, false)
    }

    override fun onResume() {
        super.onResume()

        btnNovoCliente.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_listaClientesFragment_to_novoClienteFragment)
        }
        viewModel = ViewModelProviders.of(this).get(ListaClientesViewModel::class.java)


    }
}