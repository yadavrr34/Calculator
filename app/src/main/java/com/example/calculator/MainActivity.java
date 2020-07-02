package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.calculator.R.string.emty;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btnmulti,btnpoint,btndivide,btnrem,btnclr,btndelete,btnequal;
EditText et1,et2;
Float result1,result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
    btn2=(Button)findViewById(R.id.btn2);
btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnplus=(Button)findViewById(R.id.btnplus);
        btnminus=(Button)findViewById(R.id.btnminus);
        btnmulti=(Button)findViewById(R.id.btnmulti);
        btndivide=(Button)findViewById(R.id.btndivide);
        btnpoint=(Button)findViewById(R.id.btnpoint);
        btnequal=(Button)findViewById(R.id.btnequal);
        btndelete=(Button)findViewById(R.id.btndelete);
        btnclr=(Button)findViewById(R.id.btnclr);
        btnrem=(Button)findViewById(R.id.btnrem);
        et1=(EditText)findViewById(R.id.edt1);
        et2=(EditText)findViewById(R.id.edt2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"1");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+"0");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(et2.getText()+".");
            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=et2.getText().toString();

                et2.setText(text.substring(0,text.length()-1));
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText(emty);
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result1=Float.parseFloat(String.valueOf(et1.getText()));
                et2.setText(et2.getText()+"+");
            }
        });


}
}