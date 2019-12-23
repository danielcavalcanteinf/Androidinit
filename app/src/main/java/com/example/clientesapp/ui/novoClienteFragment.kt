package com.example.clientesapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.clientesapp.R
import com.example.clientesapp.models.Cliente
import kotlinx.android.synthetic.main.fragment_novo_cliente.*

class NovoClienteFragment : Fragment() {

    lateinit var viewModel: ListaClientesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_novo_cliente, container, false)
    }

    override fun onResume() {
        super.onResume()

        viewModel = ViewModelProviders.of(this).get(ListaClientesViewModel::class.java)

        btnCadastrar.setOnClickListener {

            try{
                var nome = inputNomeCliente.text.toString()
                var telefone = inputTelefone.text.toString()
                var endereco = inputEndereco.text.toString()
                var datanasc = inputDataNasc.text.toString()

                var novoCliente = Cliente(id, nome, telefone, endereco, datanasc)

                // isso aqui está certo
                viewModel.salvarCliente(novoCliente)

                it.findNavController().popBackStack()
            } catch (e : Exception) {
                Toast.makeText(context, "Erro ao cadastrar cliente", Toast.LENGTH_SHORT).show()
                it.findNavController().popBackStack()
            }
        }

    }
}