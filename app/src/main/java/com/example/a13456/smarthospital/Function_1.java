package com.example.a13456.smarthospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Function_1 extends AppCompatActivity {
    double H=0,W=0;
    EditText Height,  Weight;
    TextView display1,display2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function_1);
        Height=(EditText)findViewById(R.id.editText);
        Weight=(EditText)findViewById(R.id.editText2);
        display1=(TextView)findViewById(R.id.textView5);
        display2=(TextView)findViewById(R.id.textView6);
    }

    public void btn(View view){
        H=Double.parseDouble(Height.getText().toString());
        W=Double.parseDouble(Weight.getText().toString());
        double a= H/100;
        double b=W/(a*a);
        java.text.DecimalFormat df =new java.text.DecimalFormat("#.00");
        String c=df.format(b);
        display1.setText("您的BMI值为："+ c);
        if(b<18.5){display2.setText("您的体重过轻");}
        else if(b<24&&b>=18.5){display2.setText("您的体重正常");}
        else if(b>=24&&b<27){display2.setText("您的体重过重");}
        else if(b>=27&&b<30){display2.setText("您的体重轻度肥胖");}
        else if(b>=30&&b<35){display2.setText("您的体重中度肥胖");}
        else {display2.setText("您的体重重度肥胖");}
    }
}
