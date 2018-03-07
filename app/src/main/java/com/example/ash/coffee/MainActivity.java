package com.example.ash.coffee;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv,middle;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.breakfast);
        middle=findViewById(R.id.middle);
        button=findViewById(R.id.Drawer);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Quesat.otf");
        tv.setTypeface(typeface);
        middle.setTypeface(typeface);
        button.setTypeface(typeface);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mi=new Intent(MainActivity.this,second.class);
                startActivity(mi);
            }
        });
    }
}
