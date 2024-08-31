package com.SalsabilaZahraSarwo.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtName:  EditText
    private lateinit var txtPassword: EditText
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txtName)
        txtPassword = findViewById(R.id.txtPassword)
        btnLogin = findViewById(R.id.btnLogin)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLogin.setOnClickListener{
            val Name = txtName.text.toString()
            val password = txtPassword.text.toString()

            if (Name == "admin" && password == "123456"){
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "username atau password salah",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

    }
}