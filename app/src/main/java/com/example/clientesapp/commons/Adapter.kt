package com.example.clientesapp.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clientesapp.R
import com.example.clientesapp.models.Cliente


class Adapter (val dataSet : List<Cliente>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val layoutItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.lista_clientes_item, parent, false)

        return ViewHolder(layoutItem)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var clienteAtual = dataSet[position]

        holder.nomeCliente.text = clienteAtual.nome
        holder.telefoneCliente.text = clienteAtual.telefone
        holder.enderecoCliente.text = clienteAtual.endereco
        holder.datanascCliente.text = clienteAtual.datanasc
    }



    inner class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var nomeCliente = itemView.findViewById<TextView>(R.id.txtNome)
        var telefoneCliente = itemView.findViewById<TextView>(R.id.txtTelefone)
        var enderecoCliente = itemView.findViewById<TextView>(R.id.txtEndereco)
        var datanascCliente = itemView.findViewById<TextView>(R.id.txtDataNascimento)
    }
}