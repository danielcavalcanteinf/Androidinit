package com.example.clientesapp.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.clientesapp.R
import com.example.clientesapp.commons.Adapter
import com.example.clientesapp.models.Cliente
import com.example.clientesapp.repository.AppRepository
import kotlinx.android.synthetic.main.fragment_lista_clientes.*
import kotlinx.android.synthetic.main.lista_clientes_item.*
import org.jetbrains.anko.sdk27.coroutines.onLongClick
import kotlin.concurrent.thread

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

        viewModel.getTodosClientes().observe(this, Observer { clientes ->
            val touchHelper = ItemTouchHelper(TouchHelper(Adapter(clientes), context!!))
            touchHelper.attachToRecyclerView(recyclerView)
            recyclerView.adapter = Adapter(clientes)
        })
    }
}