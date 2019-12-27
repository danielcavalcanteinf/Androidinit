package com.example.clientesapp.ui

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.clientesapp.commons.Adapter
import com.example.clientesapp.database.AppDataBase
import com.example.clientesapp.models.Cliente
import com.example.clientesapp.repository.AppRepository
import org.jetbrains.anko.doAsync
import kotlin.concurrent.thread

class TouchHelper(val adapter : Adapter, val context : Context) : ItemTouchHelper.Callback() {
    lateinit var database : AppDataBase
    lateinit var viewModel: ListaClientesViewModel

    override fun getMovementFlags(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder): Int {
        val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
        val swipeFlags = ItemTouchHelper.START or ItemTouchHelper.END
        return makeMovementFlags(dragFlags, swipeFlags)
    }


    override fun onMove(p0: RecyclerView, p1: RecyclerView.ViewHolder, p2: RecyclerView.ViewHolder): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, position: Int) {
        database = AppDataBase.getInstance(context)
        try{

            AppRepository(context).deletarCliente(adapter.dataSet[viewHolder.position])

        }catch (e: Exception){
            e.printStackTrace();
            Log.i("teste", "${e.printStackTrace()}")
        }
    }
}