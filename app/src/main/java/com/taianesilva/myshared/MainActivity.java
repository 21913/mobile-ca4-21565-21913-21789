package com.taianesilva.myshared;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edittext_firstname, edittext_lastname, edittext_email;
    Button save_button;
    SharedPreferences sharedPrefences;

    private static final String SHARED_PREF_FIRSTNAME = "myfirstname";
    private static final String SHARED_PREF_LASTNAME = "mylastname";
    private static final String KEY_EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    edittext_firstname = findViewById(R.id.edittext_firstname);
    edittext_lastname = findViewById(R.id.edittext_lastname);
    edittext_email = findViewById(R.id.edittext_lastname);
    save_button = findViewById(R.id.save_button);

    sharedPrefences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);

    String firstname = sharedPrefences.getString(SHARED_PREF_FIRSTNAME,null);
    String lastname = sharedPrefences.getString(SHARED_PREF_LASTNAME,null);
    String email = sharedPrefences.getString(KEY_EMAIL, null);

    if (firstname != null || lastname != null || email != null){
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }

    save_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        SharedPreferences.Editor editor = sharedPrefences.edit();
        editor.putString(SHARED_PREF_FIRSTNAME,edittext_firstname.getText().toString());
        editor.putString(SHARED_PREF_LASTNAME,edittext_lastname.getText().toString());
        editor.putString(KEY_EMAIL,edittext_email.getText().toString());
        editor.apply();

            Intent intent = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intent);

            Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
        }
    });

    }
}
