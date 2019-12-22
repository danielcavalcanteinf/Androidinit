package com.example.clientesapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clientesapp.R

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
    }


}