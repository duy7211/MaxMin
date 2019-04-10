package com.example.maxmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button btnkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intit();
        act();
    }

    public void act() {
        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = num1.getText().toString();
                String so2 = num2.getText().toString();
                if(so1.isEmpty() || so2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Không được bỏ trống các ô trên", Toast.LENGTH_LONG).show();
                } else {
                    int num1 = Integer.valueOf(so1);
                    int num2 = Integer.valueOf(so2);
                    String max = String.valueOf(max(num1, num2));
                    String min = String.valueOf(min(num1,num2));
                    Toast.makeText(MainActivity.this, "Max là: "+max+" Min là: "+min+" ." , Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    public int max(int num1, int num2) {
        int kq = (num1 > num2) ? num1 : num2;
        return kq;
    }
    public int min(int num1,int num2) {
        int kq = (num1 > num2) ? num2 : num1;
        return kq;
    }

    public void intit() {
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnkq = findViewById(R.id.btnkq);
    }
}
