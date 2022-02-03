package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String[] Text = getResources().getStringArray(R.array.Text);
    private TextView outputField;
    randomNum num = new randomNum();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                outputField = (TextView)view.getRootView().findViewById(R.id.output);
                outputField.setText(Text[num.getNum()]);

            }
        });



    }
}