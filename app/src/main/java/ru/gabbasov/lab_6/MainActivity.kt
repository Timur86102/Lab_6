package ru.gabbasov.lab_6

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun startTask1(view: View) {
        val intent = Intent(this, Task1::class.java)
        startActivity(intent)
    }

    fun startTask2(view: View) {
        val intent = Intent(this, Task2::class.java)
        startActivity(intent)
    }

    fun startTask3(view: View) {
        val intent = Intent(this, Task3::class.java)
        startActivity(intent)
    }

}