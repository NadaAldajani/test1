package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/** Called when the user taps the Send button */



 public void sendMessage(View view) {
     // Do something in response to button.
     Intent packageContext;
     Intent intent = new Intent(packageContext this, editTextTextPersonName2.class);
     EditText editText (EditText) findViewById(R.id.editTextTextPersonName2);
     String message = editText.getText().toString();
     intent.putExtra (EXTRA_MESSAGE, message);
     startActivity (intent);



 }

}