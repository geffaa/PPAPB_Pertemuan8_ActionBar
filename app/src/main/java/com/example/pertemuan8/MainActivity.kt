package com.example.pertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_home->{
                Toast.makeText(this, "Halaman Home", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_quiz->{
                Toast.makeText(this, "Halaman Home", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_assignment->{
                Toast.makeText(this, "Halaman Home", Toast.LENGTH_LONG).show()
                true
            }

            else -> {true}
        }
    }
}