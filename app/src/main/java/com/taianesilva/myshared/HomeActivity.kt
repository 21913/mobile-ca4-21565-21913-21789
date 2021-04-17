package com.taianesilva.myshared

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.taianesilva.myshared.HomeActivity

class HomeActivity : AppCompatActivity() {

    lateinit var register_fullname: TextView
    lateinit var register_phone: TextView
    lateinit var register_dateofbirth: TextView
    lateinit var register_address: TextView
    lateinit var register_email: TextView
    lateinit var save_button: Button

    lateinit var sharedPrefences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        register_fullname = findViewById(R.id.register_fullname)
        register_phone = findViewById<View>(R.id.register_phone)
        register_dateofbirth = findViewById(R.id.register_dateofbirth)
        register_address = findViewById<View>(R.id.register_address)
        register_email = findViewById(R.id.register_email)

        /* logout_button = findViewById(R.id.logout_button)
        sharedPrefences = getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE)
        val firstname = sharedPrefences.getString(SHARED_PREF_FIRSTNAME, null)
        val lastname = sharedPrefences.getString(SHARED_PREF_LASTNAME, null)
        val email = sharedPrefences.getString(KEY_EMAIL, null)
        if (firstname != null || lastname != null || email != null) {
            welcome_firstname.setText("First Name: $firstname")
            welcome_lastname.setText("Last Name: $lastname")
            welcome_email.setText("Email: $email")
        }
        logout_button.setOnClickListener(View.OnClickListener {
            val editor = sharedPrefences.edit()
            editor.clear()
            editor.commit()
            Toast.makeText(this@HomeActivity, "Log out successfully", Toast.LENGTH_SHORT).show()
            finish()
        })
    }

    companion object {
        //Shared Preferences name and key name
        private const val SHARED_PREF = "mypref"
        private const val SHARED_PREF_FIRSTNAME = "myfirstname"
        private const val SHARED_PREF_LASTNAME = "mylastname"
        private const val KEY_EMAIL = "email"
    }

        */
    }

}