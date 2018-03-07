package com.example.ash.coffee;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class second extends AppCompatActivity {
public Button plus,minus;
public TextView quantity,pay,price,error;

    public int quan=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Quesat.otf");
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        quantity=findViewById(R.id.quantity);
        quantity.setTypeface(typeface);
        pay=findViewById(R.id.pay);
        pay.setTypeface(typeface);
        String a=quantity.getText().toString();
        int res=Integer.parseInt(a);
        error=findViewById(R.id.error);
        error.setTypeface(typeface);
        error.setVisibility(error.INVISIBLE);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quan>=0)
                    error.setVisibility(error.INVISIBLE);
                quan=quan+1;
                //int temp=quan;
                String res=String.valueOf(quan);
                Log.d("Add", "Result-> " + quan);
                quantity.setText(res);
                int temp=calculate(quan);
                String nm=String.valueOf(temp);
                pay.setText(nm);
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quan=quan-1;
                if(quan<0){
                    error.setVisibility(error.VISIBLE);
                    quan=0;
                }
                else{
                    String r=String.valueOf(quan);
                    Log.d("Sub","Res: "+quan);
                    quantity.setText(r);
                    int temp=calculate(quan);
                    String nm=String.valueOf(temp);
                    pay.setText(nm);
                }

            }
        });
    }

    public int calculate(int result){
        int f=result*5;
        return f;
    }

}
