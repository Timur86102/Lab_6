package ru.gabbasov.lab_6

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun operation(view: View) {
        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)
        if((input1.text != null && input1.text.isNotEmpty()) && (input2.text != null && input2.text.isNotEmpty())) {
            if (view.id.equals(R.id.plus)) {
                findViewById<TextView>(R.id.printOperator).text = "+"
                findViewById<TextView>(R.id.result).text = (Integer.parseInt(input1.text.toString()) + Integer.parseInt(input2.text.toString())).toString()
            } else if (view.id.equals(R.id.minus)) {
                findViewById<TextView>(R.id.printOperator).text = "-"
                findViewById<TextView>(R.id.result).text = (Integer.parseInt(input1.text.toString()) - Integer.parseInt(input2.text.toString())).toString()
            } else if (view.id.equals(R.id.multiplication)) {
                findViewById<TextView>(R.id.printOperator).text = "*"
                findViewById<TextView>(R.id.result).text = (Integer.parseInt(input1.text.toString()) * Integer.parseInt(input2.text.toString())).toString()
            } else if (view.id.equals(R.id.division)) {
                findViewById<TextView>(R.id.printOperator).text = "/"
                findViewById<TextView>(R.id.result).text = (Integer.parseInt(input1.text.toString()) / Integer.parseInt(input2.text.toString())).toString()
            }
        }
    }

    fun close(view: View) {
        finish()
    }

}