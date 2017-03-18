package com.example.a13456.smarthospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Function_2 extends AppCompatActivity {
    private Spinner BodySpinner = null;
    private Spinner StateSpinner = null;
    ArrayAdapter<String> BodyAdapter=null;//适配器
    ArrayAdapter<String>StateAdapter=null;
    TextView text;
    String [][]Data =null;


    private String[]Body={"头部","口腔","眼部","胸部","胃部" };
    private String[][]State={{"疼痛","犯晕","发烧"},{"发炎","异味"},{"模糊","酸痛","肿胀"},{"发闷","疼痛","呼吸不畅"},{"酸痛","消化不良"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function_2);
        SetSpinner();
    }
    private void SetSpinner()
    {
        //实例化
        BodySpinner = (Spinner) findViewById(R.id.Spinner_Body);
        StateSpinner = (Spinner) findViewById(R.id.Spinner_State);

        //绑定适配器
        BodyAdapter = new ArrayAdapter<String>(Function_2.this, android.R.layout.simple_spinner_item, Body);
        BodySpinner.setAdapter(BodyAdapter);
        BodySpinner.setSelection(0, true);//设置默认选中项，此处为默认选中第1个值

        StateAdapter = new ArrayAdapter<String>(Function_2.this, android.R.layout.simple_spinner_item, State[4]);
        StateSpinner.setAdapter(StateAdapter);
        StateSpinner.setSelection(0, true);//设置默认选中项，此处为默认选中第1个值

//状况下拉框监听
        BodySpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        StateAdapter = new ArrayAdapter<String>(
                                Function_2.this, android.R.layout.simple_spinner_item, State[position]);
                        StateSpinner.setAdapter(StateAdapter);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

    }
}
