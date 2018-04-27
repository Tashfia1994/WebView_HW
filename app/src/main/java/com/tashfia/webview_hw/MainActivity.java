package com.tashfia.webview_hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnFb,btnGoogle,btnTwitter,btnGmail,btnGo;
    EditText etxUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFb=(Button)findViewById(R.id.btn_fb);
        btnGo=(Button)findViewById(R.id.btn_go);
        btnGoogle=(Button)findViewById(R.id.btn_google);
        btnTwitter=(Button)findViewById(R.id.btn_twitter);
        btnGmail=(Button)findViewById(R.id.btn_gmail);

        etxUrl=(EditText)findViewById(R.id.etxt_url);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=etxUrl.getText().toString();
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });
        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.google.com");
                startActivity(intent);
            }
        });
        btnGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.gmail.com");
                startActivity(intent);
            }
        });
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.twitter.com");
                startActivity(intent);
            }
        });
    }
}
