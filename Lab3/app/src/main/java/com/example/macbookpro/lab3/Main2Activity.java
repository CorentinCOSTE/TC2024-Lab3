package com.example.macbookpro.lab3;

import android.content.Intent;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.graphics.Color;

public class Main2Activity extends AppCompatActivity {

    Intent intent;
    String Username;
    String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = getIntent();
        Username = intent.getStringExtra("Username");
        Password = intent.getStringExtra("Password");

        TextView text1 = (TextView)findViewById(R.id.textView1);
        TextView text2 = (TextView)findViewById(R.id.textView2);

        if (Password.equals("Password") && Username.equals("Username")) {
            text2.setVisibility(TextView.INVISIBLE);

            Context context = getApplicationContext();
            Toast MyToast = new Toast(context);
            MyToast.makeText(context, "Correct Password and Username", Toast.LENGTH_LONG).show();
        } else {
            text1.setVisibility(TextView.INVISIBLE);

            AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
            DialogConf.setTitle("Denied !");
            DialogConf.setMessage("Your Username or/and Password is wrong.");
            DialogConf.setIcon(R.mipmap.ic_launcher);

            DialogConf.setNeutralButton("Try Again !",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    });

            AlertDialog MyDialog = DialogConf.create();
            MyDialog.show();
        }
    }
}
