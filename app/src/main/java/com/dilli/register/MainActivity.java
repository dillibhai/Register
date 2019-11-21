package com.dilli.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText etusername,etpassword;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);
        btnlogin=findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etusername.getText())) {
                    etusername.setError(("Please Enter User name"));
                    etusername.requestFocus();
                    return;
                } else if (TextUtils.isEmpty((etpassword.getText()))) {
                    etpassword.setError("Please Enter Your Password");
                    etpassword.requestFocus();
                    return;

                }
            }
        });
    }
}
