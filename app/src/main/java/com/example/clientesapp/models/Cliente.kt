package com.example.clientesapp.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "clientes")
data class Cliente(
    @ColumnInfo(name = "nome")
    var nome: String,
    @ColumnInfo(name = "fone")
    var telefone: String,
    var endereco: String,
    var datanasc: String
) {
    @PrimaryKey(autoGenerate = true)
    var codigo: Int = 0
}