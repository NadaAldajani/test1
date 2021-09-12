package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class displayMassageActivity<message> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_massage);
    }

    // Get the Intent that started this activity and extract the string String
    message = intent.getString Extra (MainActivity. EXTRA_MESSAGE);

    Intent intent = getIntent();

// Capture the Layout's TextView and set the string as its text
TextView textView = findViewById(R.id. textView); textView.setText (message);I

}
}