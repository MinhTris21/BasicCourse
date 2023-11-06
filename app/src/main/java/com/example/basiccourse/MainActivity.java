package com.example.basiccourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    public void button (View view){
    TextView enterFirst = findViewById(R.id.txtFirst);
    TextView enterSurface = findViewById(R.id.txtSurface);
    TextView enterEmail = findViewById(R.id.txtEmail);

    EditText getname = findViewById(R.id.edtFirst);
    EditText getsurface = findViewById(R.id.edtSurface);
    EditText getemail= findViewById(R.id.edtEmail);

    enterFirst.setText("Your first name " + getname.getText().toString());
    enterSurface.setText("Your surface name " + getsurface.getText().toString());
    enterEmail.setText("Your email " + getemail.getText().toString());
    }

     */

}