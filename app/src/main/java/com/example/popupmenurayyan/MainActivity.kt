package com.example.popupmenurayyan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button)
        button.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }




private fun showPopupMenu(view: View) {
    val popupMenu = PopupMenu(this, view)
    val inflater = popupMenu.menuInflater
    inflater.inflate(R.menu.popup_menu, popupMenu.menu)

    popupMenu.setOnMenuItemClickListener { item ->
        when (item.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "Item 1 Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item2 -> {
                Toast.makeText(this, "Item 2 Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item3 -> {
                Toast.makeText(this, "Item 3 Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item4 -> {
                Toast.makeText(this, "Item 4 Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }

    popupMenu.show()
    }
}