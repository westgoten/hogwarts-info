package com.uionlyapp.hogwarts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mail = findViewById(R.id.mail_link);
        mail.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
