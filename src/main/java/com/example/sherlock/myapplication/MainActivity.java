package com.example.sherlock.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button badd, bsub, bdiv, bmul, bequal, bclr, bpoint;

    String t,t1;
    int countp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.result);
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btn0 = findViewById(R.id.zero);

        badd = findViewById(R.id.add);
        bsub = findViewById(R.id.sub);
        bdiv = findViewById(R.id.div);
        bmul = findViewById(R.id.mul);
        bclr = findViewById(R.id.clear);
        bpoint = findViewById(R.id.point);
        countp =0;

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1 && t.equals("0"))
                    textView.setText(btn0.getText());
                else
                    textView.append(btn0.getText());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn1.getText());
                else
                    textView.append(btn1.getText());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn2.getText());
                else
                    textView.append(btn2.getText());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn3.getText());
                else
                    textView.append(btn3.getText());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn4.getText());
                else
                    textView.append(btn4.getText());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn5.getText());
                else
                    textView.append(btn5.getText());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn6.getText());
                else
                    textView.append(btn6.getText());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn7.getText());
                else
                    textView.append(btn7.getText());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn8.getText());
                else
                    textView.append(btn8.getText());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                if(t.length()==1&&t.equals("0"))
                    textView.setText(btn9.getText());
                else
                    textView.append(btn9.getText());
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                countp =0;
                t1=t.substring(t.length()-1,t.length());
                if(t1.equals("+")||t1.equals("-")||t1.equals("/")||t1.equals("*"))
                    textView.setText(t.substring(0,t.length()-1)+"+");
                else
                    textView.append(badd.getText());
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                t1=t.substring(t.length()-1,t.length());
                countp =0;
                if(t1.equals("+")||t1.equals("-")||t1.equals("/")||t1.equals("*"))
                    textView.setText(t.substring(0,t.length()-1)+"-");
                else
                    textView.append(bsub.getText());
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countp =0;
                t=textView.getText().toString();
                t1=t.substring(t.length()-1,t.length());
                if(t1.equals("+")||t1.equals("-")||t1.equals("/")||t1.equals("*"))
                    textView.setText(t.substring(0,t.length()-1)+"*");
                else
                    textView.append("*");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=textView.getText().toString();
                countp =0;
                t1=t.substring(t.length()-1,t.length());
                if(t1.equals("+")||t1.equals("-")||t1.equals("/")||t1.equals("*"))
                    textView.setText(t.substring(0,t.length()-1)+"/");
                else
                    textView.append(bdiv.getText());
            }
        });

        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("0");
                countp=0;
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(countp<1){
                    textView.append(bpoint.getText());
                    countp++;
                }
            }
        });


    }

    public void click(View view) {
        ArrayList<String> alist = new ArrayList<>();
        String ip = textView.getText().toString();
        int count = 0;
        String t="",t1="";
        int k=0;

        for (int i = 1; i <=ip.length(); i++) {
            if(ip.charAt(i-1)=='+'||ip.charAt(i-1)=='-'||ip.charAt(i-1)=='*'||ip.charAt(i-1)=='/'){
                if(!t.equals(""))
                    alist.add(t);
                count++;
                t1=Character.toString(ip.charAt(i-1));
                if(!t1.equals(""))
                    alist.add(t1);
                t="";
            }else{
                t+=ip.substring(i-1, i);
            }
        }
        if(!t.equals(""))
            alist.add(t);
        double sum=0.0;
        double op1=0.0,op2=0.0;
        int flag=0;

        for(int i=0;i<count;i++) {
            flag=0;
            if (alist.contains("/")) {
                k = alist.indexOf("/");
                try {
                    op1 = Double.parseDouble(alist.get(k - 1));
                } catch (Exception e) {
                    op1 = 0;
                }
                try {
                    op2 = Double.parseDouble(alist.get(k + 1));
                } catch (Exception e) {
                    op2 = 1;
                }
                if(op1==0&&op2==0)
                    flag=1;
                else
                    sum = op1 / op2;
                alist.set(k, String.valueOf(sum));
                if(alist.size()!=2){
                    alist.remove(k-1);
                    alist.remove(k);
                }
            } else if (alist.contains("*")) {
                k = alist.indexOf("*");
                try {
                    op1 = Double.parseDouble(alist.get(k - 1));
                } catch (Exception e) {
                    op1 = 0;
                }
                try {
                    op2 = Double.parseDouble(alist.get(k + 1));
                } catch (Exception e) {
                    op2 = 1;
                }
                sum = op2 * op1;
                alist.set(k, String.valueOf(sum));
                if(alist.size()!=2){
                    alist.remove(k-1);
                    alist.remove(k);
                }
            } else if (alist.contains("-")) {
                k = alist.indexOf("-");
                try {
                    op1 = Double.parseDouble(alist.get(k - 1));
                } catch (Exception e) {
                    op1 = 0;
                }
                try {
                    op2 = Double.parseDouble(alist.get(k + 1));
                } catch (Exception e) {
                    op2 = 0;
                }
                sum = op1 - op2;
                alist.set(k, String.valueOf(sum));
                if(alist.size()!=2){
                    alist.remove(k-1);
                    alist.remove(k);
                }
            } else if (alist.contains("+")) {
                k = alist.indexOf("+");
                try {
                    op1 = Double.parseDouble(alist.get(k - 1));
                } catch (Exception e) {
                    op1 = 0;
                }
                try {
                    op2 = Double.parseDouble(alist.get(k + 1));
                } catch (Exception e) {
                    op2 = 0;
                }
                sum = op2 + op1;
                alist.set(k, String.valueOf(sum));
                if(alist.size()!=2){
                    alist.remove(k-1);
                    alist.remove(k);
                }
            }
        }
        if(flag==1)
            textView.setText("Invalid!");
        else
            textView.setText(""+sum);
    }
}


