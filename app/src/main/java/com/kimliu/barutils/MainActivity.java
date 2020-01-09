package com.kimliu.barutils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.kimliu.kimbarutil.Bar2Utils;
import com.kimliu.kimbarutil.BarUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout content = findViewById(R.id.content);


//        //使用BarUtils
//        BarUtils.setStatusBarColor(this, Color.WHITE);
//        BarUtils.addMarginTopEqualStatusBarHeight(content);
//        BarUtils.setStatusBarLightMode(this,true);

        //使用Bar2Utils
        Bar2Utils.setColorNoTranslucent(this,Color.WHITE);
        Bar2Utils.setStatusBarLightMode(this,true);

    }
}
