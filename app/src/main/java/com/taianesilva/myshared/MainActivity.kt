package com.taianesilva.myshared

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var edittext_username:EditText
    lateinit var edit_password:EditText
    lateinit var edittext_newaccount:EditText
    lateinit var save_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittext_username = findViewById(R.id.edittext_username)
        edit_password = findViewById(R.id.edit_password)
        edittext_newaccount = findViewById(R.id.edittext_newaccount)

        findViewById<Button>(R.id.save_button).setOnClickListener{
            saveData ()
        }
        findViewById<EditText>(R.id.edittext_newaccount).setOnClickListener{

        }
    }
    private fun saveData() {

        if(edittext_username != null) {
            println("Please enter with your username")
        }

        if(edit_password != null) {
            println("Please enter with your password")
        }
        return
       /* if(edittext_username.text.isEmpty()){
            edittext_username.error = "Please enter with your username"
            return
        }
        if(edit_password.text.isEmpty()){
            edit_password.error = "Please enter your password"
            return*/



        val mypref = getSharedPreferences("mypref", Context.MODE_PRIVATE)
        val editor = mypref.edit()

        editor.putString("Username", edittext_username.text.toString())
        editor.putString("Password", edit_password.text.toString())

        editor.apply()
        Toast.makeText(this, "Data saved", Toast.LENGTH_LONG).show()


    }


}