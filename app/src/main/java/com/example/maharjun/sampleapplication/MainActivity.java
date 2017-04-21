package com.example.maharjun.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    public void showToastMessage(View view) {

//        Toast.makeText(this, "Hi This is Maharjun", Toast.LENGTH_LONG).show();
    }

    public void setListener() {
        Button button = (Button) findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hi This is Maharjun", Toast.LENGTH_LONG).show();
            }

//            @Override
//            public void OnClick(View view) {
//                Toast.makeText(this, "Hi This is Maharjun", Toast.LENGTH_LONG).show();
//            }
        });
    }
}
