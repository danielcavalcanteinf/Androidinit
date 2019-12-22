package com.example.clientesapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.clientesapp.models.Cliente

@Dao
interface ClientesDAO {

    @Query("select * from clientes")
    fun getTodosClientes() : List<Cliente>

    @Query("select * from clientes")
    fun getTodos() : LiveData<List<Cliente>>

    @Insert
    fun addCliente(novoCliente: Cliente)

    @Update
    fun updateCliente (clienteAtualizado : Cliente)

    @Delete
    fun deleteCliente (clienteDeletado : Cliente)
}