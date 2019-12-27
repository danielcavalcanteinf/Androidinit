package com.example.clientesapp.repository

import android.content.Context
import com.example.clientesapp.database.AppDataBase
import com.example.clientesapp.models.Cliente
import org.jetbrains.anko.doAsync

class AppRepository (context: Context){

    val database = AppDataBase.getInstance(context)

    fun getTodosLiveData() = database.Dao().getTodosLiveData()

    fun salvarNovoCliente(novoCliente : Cliente) {

        doAsync {
            database.Dao().addCliente(novoCliente)
        }
    }

    fun deletarCliente(clienteDeletado: Cliente) {

        doAsync {
            database.Dao().deleteCliente(clienteDeletado)
        }
    }
}