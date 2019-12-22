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
    var nome : String,

    @ColumnInfo(name = "fone")
    var telefone : String,

    var endereco : String,
    var datanasc : String
)