package com.n9s.flyjet.hk2018010401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //TextView tv = new TextView(this);
        //tv.setText("Hello, friend!");

        Button btn = new Button(this);
        btn.setText("Click me");
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Click!!!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2 = new Button(this);
        btn2.setText("Click me2");
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Click2!!!", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout. VERTICAL); //按鈕擺垂直
        //setContentView(btn);
        layout.addView(btn);
        layout.addView(btn2);
        setContentView(layout);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Toast.makeText(MainActivity.this, height + "," + width, Toast.LENGTH_SHORT).show();
    }
}
