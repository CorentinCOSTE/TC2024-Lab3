package com.example.macbookpro.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Submit;
    String Username;
    String Password;
    Intent intent;
    EditText UserText;
    EditText PasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit = (Button) findViewById(R.id.button);
        UserText = (EditText) findViewById(R.id.editText);
        PasswordText = (EditText) findViewById(R.id.editText3);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,Main2Activity.class);
                Username = UserText.getText().toString();
                Password = PasswordText.getText().toString();

                intent.putExtra("Username", Username);
                intent.putExtra("Password", Password);
                startActivity(intent);
            }
        });
    }
}
