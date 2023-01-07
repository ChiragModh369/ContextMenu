package com.example.contentprovider

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var txtShowContext : TextView
    lateinit var bg_const:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtShowContext = findViewById(R.id.txtShowContext)
        bg_const = findViewById(R.id.bg_const)

        registerForContextMenu(txtShowContext)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu_context,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.menuOrange -> {
                bg_const.setBackgroundResource(R.color.Orange)
            }

            R.id.menuRed -> {
                bg_const.setBackgroundColor(Color.RED)
            }

            R.id.menuBlue -> {
                bg_const.setBackgroundColor(Color.BLUE)
            }

            R.id.menuGreen -> {
                bg_const.setBackgroundColor(Color.GREEN)
            }

        }

        return super.onContextItemSelected(item)
    }
}