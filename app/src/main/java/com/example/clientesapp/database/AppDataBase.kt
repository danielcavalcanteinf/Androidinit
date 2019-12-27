package com.example.clientesapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.clientesapp.models.Cliente

@Database(entities = [Cliente::class], version = 5)
abstract class AppDataBase : RoomDatabase() {

    abstract fun Dao() : ClientesDAO

    companion object {
        var INSTANCE : AppDataBase? = null

        fun getInstance(context : Context) : AppDataBase {
            return if(INSTANCE == null) {
                INSTANCE=  Room.databaseBuilder(
                    context,
                    AppDataBase::class.java,
                    "database.db"
                ).fallbackToDestructiveMigration().build()

                INSTANCE as AppDataBase
            } else {
                INSTANCE as AppDataBase
            }
        }
    }

}