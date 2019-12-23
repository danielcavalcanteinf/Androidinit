package com.example.clientesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.clientesapp.database.AppDataBase
import kotlinx.android.synthetic.main.fragment_lista_clientes.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            //após adicionar seta para voltar, o título da tela fica com nome do fragment.kt
        val navController = this.findNavController(R.id.navHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navHostFragment)
        return navController.navigateUp()
    }
}
