package com.example.jaswanth.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.*;


public class MainActivity extends AppCompatActivity {

    Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,add,sub,mul,div,del,ac,equal,posorneg,decpoint;
    EditText numres;
    float firstNumber,secondNumber,finalResult;
    int op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numres=(EditText)findViewById(R.id.numberresult);

        n0=(Button)findViewById(R.id.number0);
        n1=(Button)findViewById(R.id.number1);
        n2=(Button)findViewById(R.id.number2);
        n3=(Button)findViewById(R.id.number3);
        n4=(Button)findViewById(R.id.number4);
        n5=(Button)findViewById(R.id.number5);
        n6=(Button)findViewById(R.id.number6);
        n7=(Button)findViewById(R.id.number7);
        n8=(Button)findViewById(R.id.number8);
        n9=(Button)findViewById(R.id.number9);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.multiply);
        div=(Button)findViewById(R.id.divide);
        del=(Button)findViewById(R.id.delete);
        ac=(Button)findViewById(R.id.allclear);
        equal=(Button)findViewById(R.id.equal);
        posorneg=(Button)findViewById(R.id.posorneg);
        decpoint=(Button)findViewById(R.id.decimalpoint);

        n0.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 0;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=0;
                                          numres.setText(String.valueOf(a));
                                      }


                                  }
                              }

        );
        n1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 1;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=1;
                                          numres.setText(String.valueOf(a));
                                      }


                                  }
                              }

        );
        n2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 2;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=2;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        n3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 3;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=3;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        n4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 4;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=4;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        n5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 5;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=5;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        n6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 6;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=6;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        n7.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 7;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=7;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        n8.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 8;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=8;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        n9.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      try {
                                          double a = Double.valueOf(numres.getText().toString());
                                          a = (a*10) + 9;
                                          numres.setText(String.valueOf(a));
                                      }
                                      catch (Exception e){
                                          double a=9;
                                          numres.setText(String.valueOf(a));
                                      }

                                  }
                              }

        );
        decpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b1=(Button)v;
                numres.setText(numres.getText().toString()+b1.getText().toString());
            }
        });
        posorneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float n=Float.valueOf(numres.getText().toString());
                n=n*-1;
                numres.setText(String.valueOf(n));
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = numres.getText().length();
                if (length > 0) {
                    numres.setText(numres.getText().delete(length - 1, length));
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numres.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber=Float.valueOf(numres.getText().toString());
                op=1;
                numres.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber=Float.valueOf(numres.getText().toString());
                op=2;
                numres.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber=Float.valueOf(numres.getText().toString());
                op=3;
                numres.setText("");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber=Float.valueOf(numres.getText().toString());
                op=4;
                numres.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    secondNumber = Float.valueOf(numres.getText().toString());
                    if (op == 1) {
                        finalResult = firstNumber + secondNumber;
                    }
                    if (op == 2) {
                        finalResult = firstNumber - secondNumber;
                    }
                    if (op == 3) {
                        finalResult = firstNumber / secondNumber;
                    }
                    if (op == 4) {
                        finalResult = firstNumber * secondNumber;
                    }
                    numres.setText(String.valueOf(finalResult));
                }
                    catch(Exception e)
                {

                }
            }
        });





    }
}
