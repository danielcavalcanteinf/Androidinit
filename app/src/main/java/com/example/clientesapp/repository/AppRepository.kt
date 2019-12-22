package com.example.clientesapp.repository

import android.content.Context
import com.example.clientesapp.database.AppDataBase
import com.example.clientesapp.models.Cliente

class AppRepository (context: Context){
    val database = AppDataBase.getInstance(context)

    fun getTodos() = database.Dao().getTodos()

    fun setCliente() = database.Dao().addCliente()




}