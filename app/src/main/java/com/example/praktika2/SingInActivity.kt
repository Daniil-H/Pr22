package com.example.praktika2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.meditation.R

class SingInActivity : AppCompatActivity() {
    lateinit var  email: EditText
    lateinit var  password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
        email = findViewById(R.id.email)
        password= findViewById(R.id.password)

        fun signin(view: View)
        {
            if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            }
            else
            {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("У вас есть незаполненные поля")
                    .setPositiveButton("Ok", null)
                    .create()
                    .show()
            }
            }

        }

    fun signin(view: View)
    {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
    }


