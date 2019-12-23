package com.example.clientesapp.repository

import android.content.Context
import com.example.clientesapp.database.AppDataBase
import com.example.clientesapp.models.Cliente
import org.jetbrains.anko.doAsync

class AppRepository (context: Context){

    val database = AppDataBase.getInstance(context)

    fun getTodosLiveData() = database.Dao().getTodosLiveData()

    // ta vendo aqui , o metodo salvarNovoCliente não recebe nenhum cliente
    // então ele não sabe qual cliente ele deve passar o metodo addcliente
    //então para corrigir o erro, devemos receber um cliente neste metodo
    // para passar para o addcliente
    fun salvarNovoCliente(novoCliente : Cliente) {
        // para inserir o cliente não podemos fazer na theread principal
        //então chamo doAsync Para fazer este processo em segundo plano (background) acho que vai resolver
        doAsync {
            database.Dao().addCliente(novoCliente)
        }
    }

}