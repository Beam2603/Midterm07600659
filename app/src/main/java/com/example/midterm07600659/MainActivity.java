package com.example.midterm07600659;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.CheckBox;
import android.widget.EditText;
//import android.widget.ListPopupWindow;
import android.widget.Toast;

import com.example.midterm07600659.model.Auth;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t= makeText(MainActivity.this,"Welcome", LENGTH_SHORT);
        t.show();

        Button loginButton=findViewById(R.id.login_button); //ใช้ตัวแปร loginbotton go to layout
        // befor viewOn พิม new
        loginButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEdittext = findViewById(R.id.us_edit_text);
                EditText passwordEdittext = findViewById(R.id.ps_edit_text);
                String inputuser = userEdittext.getText().toString();
                String inputpass = passwordEdittext.getText().toString();
                Auth auth = new Auth(inputuser,inputpass);
                final boolean result = auth.check();
                if(result){
                    Intent intent = new Intent(MainActivity.this,facebooksp.class);
                    intent.putExtra("aaa", inputuser);
                    startActivity(intent);
                    finish();
                    Toast.makeText(MainActivity.this,"ยินดีต้อนรับ",Toast.LENGTH_SHORT).show();
                }
                else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage("Invalid email or password");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
            }


        }));

    }
    }

}