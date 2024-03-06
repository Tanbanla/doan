package com.example.doan.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.doan.R;
import com.example.doan.databinding.ActivityIntroBinding;

public class MainActivity_Intro extends BaseActivity {
     ActivityIntroBinding introBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        introBinding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(introBinding.getRoot());

        setVariable();
        getWindow().setStatusBarColor(Color.parseColor("#F3EA9E"));
    }
    private  void  setVariable(){
        introBinding.signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAuth.getCurrentUser()!= null){
                    startActivity(new Intent(MainActivity_Intro.this, MainActivity.class));
                }else {
                    startActivity(new Intent(MainActivity_Intro.this, SignUpActivity.class));
                }
            }
        });

        introBinding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity_Intro.this, LoginActivity.class));
            }
        });
    }
}