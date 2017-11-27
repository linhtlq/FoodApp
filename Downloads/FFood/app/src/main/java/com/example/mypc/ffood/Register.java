package com.example.mypc.ffood;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {


    private Dialog dialog;
    private TextView tv;
    private EditText editName,editPassword,editEmail,editAddress;
    private Button btn;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        connectView();
    }
    private void connectView() {
        editName=(EditText) findViewById(R.id.editName);
        editPassword=(EditText) findViewById(R.id.editPassword);
        editEmail=(EditText) findViewById(R.id.editEmail);
        editAddress=(EditText) findViewById(R.id.editAddress);
        btn = (Button) findViewById(R.id.btn);
        btnClear = (Button) findViewById(R.id.btnClear);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editName.setText(null);
                editPassword.setText(null);
                editEmail.setText(null);
                editAddress.setText(null);

            }
        });
    }
    private void showDialog() {
        dialog = new Dialog(this);
        dialog.setTitle("Đăng Ký Thành Công");
        dialog.setContentView(R.layout.dialog);
        dialog.show();
    }


}
