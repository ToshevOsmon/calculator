package com.uzandroid.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    TextView outputText, inputText;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPoint,
            btnQushish, btnAyirish, btnQavis1, btnQavis2, btnKupaytirish,
            btnBulish, btnClearAll, btnClear, btnTeng, btnFactorial, btnKvadrat, btnSqrt, btnTaqsim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");



        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });


        inputText = findViewById(R.id.inputText);
        outputText = findViewById(R.id.outputText);


        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnClearAll = findViewById(R.id.btnClearAll);
        btnClear = findViewById(R.id.btnClear);
        btnPoint = findViewById(R.id.btnPoint);
        btnQavis1 = findViewById(R.id.btnQavs1);
        btnQavis2 = findViewById(R.id.btnQavs2);
        btnFactorial = findViewById(R.id.btnFactorial);
        btnKvadrat = findViewById(R.id.btnKvadrat);
        btnSqrt = findViewById(R.id.btnSqrt);
        btnTaqsim = findViewById(R.id.btnTaqsim);

        btnQushish = findViewById(R.id.btnQushish);
        btnAyirish = findViewById(R.id.btnAyirish);
        btnKupaytirish = findViewById(R.id.btnKupaytirish);
        btnBulish = findViewById(R.id.btnBulish);

        btnTeng = findViewById(R.id.btnTeng);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inputText.setText(inputText.getText() + "0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "9");

            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();

                }/* else if (inputText.getText().toString().contains(".")) {
                    Toast.makeText(MainActivity.this, "Error number", Toast.LENGTH_SHORT).show();
                }*/ else {
                    inputText.setText(inputText.getText() + ".");
                }
            }
        });

        btnClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText("");
                outputText.setText("");

                Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = inputText.getText().toString();

                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                } else {
                    text = text.substring(0, text.length() - 1);
                    inputText.setText(text);
                }
            }
        });


        btnBulish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = inputText.getText().toString();

                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                } else if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/")) {

                    Toast.makeText(MainActivity.this, "Error number", Toast.LENGTH_SHORT).show();
                } else {
                    inputText.setText(inputText.getText() + "/");
                }

            }
        });

        btnKupaytirish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = inputText.getText().toString();

                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                } else if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/")) {
                    Toast.makeText(MainActivity.this, "Error number", Toast.LENGTH_SHORT).show();
                } else {
                    inputText.setText(inputText.getText() + "*");
                }

            }
        });

        btnQushish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = inputText.getText().toString();

                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                } else if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/")) {
                    Toast.makeText(MainActivity.this, "Error number", Toast.LENGTH_SHORT).show();
                } else {
                    inputText.setText(inputText.getText() + "+");
                }

            }
        });

        btnAyirish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = inputText.getText().toString();

                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                } else if (text.endsWith("+") || text.endsWith("-") || text.endsWith("*") || text.endsWith("/")) {
                    Toast.makeText(MainActivity.this, "Error number", Toast.LENGTH_SHORT).show();
                } else {
                    inputText.setText(inputText.getText() + "-");
                }

            }
        });


        btnTeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (inputText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Input Number", Toast.LENGTH_SHORT).show();
                } else {

                    String val = inputText.getText().toString();

                    double resalt = results(val);
                    String nateja = String.valueOf(resalt);
                    outputText.setText(nateja);
                    inputText.setText(val);
                }

            }
        });


        btnTeng.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {


                String output = outputText.getText().toString();
                inputText.setText(output);
                outputText.setText("");


                return true;

            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double t = Double.parseDouble(inputText.getText().toString());
                int val = Integer.parseInt(inputText.getText().toString());

                if (inputText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    int fact = factorial(val);
                    outputText.setText(val + "!");
                    inputText.setText(String.valueOf(fact));
                }

            }
        });


        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inputText.setText(inputText.getText() + "√");
            }
        });

        btnQavis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inputText.setText(inputText.getText() + "(");

            }
        });
        btnQavis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inputText.setText(inputText.getText() + ")");

            }
        });


        btnKvadrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                } else {
                  /*  double d = Double.parseDouble(outputText.getText().toString());
                    double kv = d * d;
                    outputText.setText(String.valueOf(kv));
                    inputText.setText(d + "²");*/
                    inputText.setText(inputText.getText() + "²");

                }


            }
        });

        btnTaqsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                } else {
                    inputText.setText(inputText.getText() + "%");
                }

            }
        });

    }


    @Override
    protected void onStop() {
        super.onStop();
        String input = inputText.getText().toString();
        String output = outputText.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("Save", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("input", input);
        editor.putString("output", output);
        editor.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();

        SharedPreferences sharedPreferences = getSharedPreferences("Save", Context.MODE_PRIVATE);
        String output = sharedPreferences.getString("output", "");
        String input = sharedPreferences.getString("input", "");
        outputText.setText(output);
        inputText.setText(input);

    }

    private int factorial(int val) {

        return (val == 1 || val == 0) ? 1 : val * factorial(val - 1);
    }


    public static double results(final String text) {


        return new Object() {

            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < text.length()) ? text.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {

                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < text.length()) throw new RuntimeException("Error" + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm();//addition
                    else if (eat('-')) x -= parseTerm();//subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();

                for (; ; ) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }

            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int starPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(text.substring(starPos, this.pos));
                } else if ((ch >= 'a' && ch <= 'z') || ch == '√') {
                    while ((ch >= 'a' && ch <= 'z') || ch == '√') nextChar();
                    String func = text.substring(starPos, this.pos);
                    x = parseFactor();

                    if (func.equals("√")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(Math.toRadians(x));
                    else if (func.equals("ln")) x = Math.log(Math.toRadians(x));

                } else {
                    throw new RuntimeException("Function not found" + (char) ch);
                }
                if (eat('%')) x = x / 100;
                if (eat('²')) x = x * x;

                return x;

            }
        }.parse();

    }

}
