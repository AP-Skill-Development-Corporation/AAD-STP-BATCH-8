package com.muneiah.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView label;
int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label=findViewById(R.id.tv_data);
    }

    public void show_ToastMessage(View view) {
        //Toast.makeText(this,"Welcome to App Development",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Welcome to APP Development ", Toast.LENGTH_SHORT).show();
    }

    public void show_count(View view) {
        c++;
        label.setText(String.valueOf(c));
    }
}
