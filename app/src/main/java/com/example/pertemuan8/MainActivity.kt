package com.example.pertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.pertemuan8.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var mediator: TabLayoutMediator
    lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Dashboard"
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager2 = viewPager
            viewPager.adapter = TabAdapter(supportFragmentManager
            , this@MainActivity.lifecycle)
            mediator = TabLayoutMediator(tabLayout, viewPager)
            {tab, position ->
                when (position){
                    0-> tab.text = "Home"
                    1-> tab.text = "Quiz"
                    2-> tab.text = "Assignment"
                }
            }
            mediator.attach()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_home->{
                viewPager2.currentItem = 0
                Toast.makeText(this, "Halaman Home", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_quiz->{
                viewPager2.currentItem = 1
                Toast.makeText(this, "Halaman Quiz", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_assignment->{
                viewPager2.currentItem = 2
                Toast.makeText(this, "Halaman Assignment", Toast.LENGTH_LONG).show()
                true
            }

            else -> {true}
        }
    }
}