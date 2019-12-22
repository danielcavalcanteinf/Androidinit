package com.example.clientesapp.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "clientes")
data class Cliente(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val codigo : Int,

    @ColumnInfo(name = "nome")
    val nome : String,

    @ColumnInfo(name = "fone")
    val telefone : String,

    val endereco : String/*,
    val datanasc : Date*/
)