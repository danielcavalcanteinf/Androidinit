package com.example.clientesapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.clientesapp.models.Cliente
import com.example.clientesapp.repository.AppRepository

class ListaClientesViewModel(application: Application) : AndroidViewModel(application) {
    private val appRepository = AppRepository(application)

    init {
        appRepository.database
    }
    fun getTodosClientes() = appRepository.getTodos()

    fun salvarCliente(novoCliente : Cliente) {

    }
}