package com.example.clientesapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.clientesapp.models.Cliente
import com.example.clientesapp.repository.AppRepository

class ListaClientesViewModel(application: Application) : AndroidViewModel(application) {
    private val appRepository = AppRepository(application)

    init {
        appRepository.getTodosLiveData()
    }
    fun getTodosClientes() = appRepository.getTodosLiveData()

    fun salvarCliente(novoCliente : Cliente) {
        // ante o novoCliente não estava sendo utilizado
        // agora está
        //Mas o erro agora é porque o salvarNovoCliente não está esperando um cliente
        appRepository.salvarNovoCliente(novoCliente)
    }

}