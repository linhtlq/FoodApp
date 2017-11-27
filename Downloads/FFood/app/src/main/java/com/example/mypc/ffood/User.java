package com.example.mypc.ffood;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class User extends AppCompatActivity {
    Button backbtn;
    TextView username,username_title;
    ImageView avatar;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        setContentView(R.layout.activity_user);
        backbtn = (Button)findViewById(R.id.back_btn);
        username = (TextView)findViewById(R.id.username);
        username_title = (TextView)findViewById(R.id.username_title);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Index.class);
                startActivity(intent);
            }
        });
    }
}
