package com.example.szamologep2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    Button egy, ketto, harom, negy, ot, hat, het, nyolc, kilenc, nulla, c, torol, egyenlo, osszeadas, kivonas, szorzas, osztas, negyzet, gyok, pont;
    TextView eredmeny;
    String ki = "";

    double osszeg, kulonbseg, szorzat, hanyados, hatvany, gyoke = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        egy = (Button) findViewById(R.id.one);
        ketto = (Button) findViewById(R.id.two);
        harom = (Button) findViewById(R.id.three);
        negy = (Button) findViewById(R.id.four);
        ot = (Button) findViewById(R.id.five);
        hat = (Button) findViewById(R.id.six);
        het = (Button) findViewById(R.id.seven);
        nyolc = (Button) findViewById(R.id.eight);
        kilenc = (Button) findViewById(R.id.nine);
        nulla = (Button) findViewById(R.id.zero);
        c = (Button) findViewById(R.id.c);
        torol = (Button) findViewById(R.id.del);
        egyenlo = (Button) findViewById(R.id.eq);
        osszeadas = (Button) findViewById(R.id.plus);
        kivonas = (Button) findViewById(R.id.minus);
        szorzas = (Button) findViewById(R.id.times);
        osztas = (Button) findViewById(R.id.div);
        negyzet = (Button) findViewById(R.id.pow);
        gyok = (Button) findViewById(R.id.sqrt);
        pont = (Button) findViewById(R.id.dot);

        eredmeny = (TextView) findViewById(R.id.res);

        egy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "1";
                    kiir(ki);
                }
            }
        });

        ketto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "2";
                    kiir(ki);
                }
            }
        });

        harom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "3";
                    kiir(ki);
                }
            }
        });

        negy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "4";
                    kiir(ki);
                }
            }
        });

        ot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "5";
                    kiir(ki);
                }
            }
        });

        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "6";
                    kiir(ki);
                }
            }
        });

        het.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "7";
                    kiir(ki);
                }
            }
        });

        nyolc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "8";
                    kiir(ki);
                }
            }
        });

        kilenc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "9";
                    kiir(ki);
                }
            }
        });

        nulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 40)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "0";
                    kiir(ki);
                }
            }
        });

        torol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki != null && 0 < ki.length()){
                    ki = ki.substring(0, ki.length()-1);
                }
                kiir(ki);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ki = "";

                kiir(ki);
            }
        });

        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 39)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "+";
                    kiir(ki);
                }
            }
        });

        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 39)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "-";
                    kiir(ki);
                }
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 39)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "*";
                    kiir(ki);
                }
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 39)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "/";
                    kiir(ki);
                }
            }
        });

        negyzet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 39)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "pow";
                    kiir(ki);
                }
            }
        });

        gyok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 36)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += "sqrt";
                    kiir(ki);
                }
            }
        });

        pont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.length() >= 39)
                    Toast.makeText(MainActivity.this, "Nem tudsz több karaktert beírni!", Toast.LENGTH_SHORT).show();
                else {
                    ki += ".";
                    kiir(ki);
                }
            }
        });

        egyenlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ki.contains("+")) {
                    String[] reszek = ki.split("[+]", 2);
                    double a = Double.parseDouble(reszek[0]);
                    double b = Double.parseDouble(reszek[1]);

                    osszeg = a + b;
                    ki = String.valueOf(osszeg);
                    kiir(ki);
                }
                else if (ki.contains("-")) {
                    String[] reszek = ki.split("-", 2);
                    double a = Double.parseDouble(reszek[0]);
                    double b = Double.parseDouble(reszek[1]);

                    kulonbseg = a - b;
                    ki = String.valueOf(kulonbseg);
                    kiir(ki);
                }
                else if (ki.contains("*")) {
                    String[] reszek = ki.split("[*]", 2);
                    double a = Double.parseDouble(reszek[0]);
                    double b = Double.parseDouble(reszek[1]);

                    szorzat = a * b;
                    ki = String.valueOf(szorzat);
                    kiir(ki);
                }
                else if (ki.contains("/")) {
                    String[] reszek = ki.split("/", 2);
                    double a = Double.parseDouble(reszek[0]);
                    double b = Double.parseDouble(reszek[1]);

                    hanyados = a / b;
                    ki = String.valueOf(hanyados);
                    kiir(ki);
                }
                else if (ki.contains("pow")) {
                    String[] reszek = ki.split("pow", 2);
                    double a = Double.parseDouble(reszek[0]);
                    double b = Double.parseDouble(reszek[1]);

                    hatvany = pow(a, b);
                    ki = String.valueOf(hatvany);
                    kiir(ki);
                }
                else if (ki.contains("sqrt")) {
                    double a = Double.parseDouble(ki.split("sqrt", 2)[0]);
                    gyoke = sqrt(a);
                    ki = String.valueOf(gyoke);
                    kiir(ki);
                }
            }
        });
    }

    public void kiir(String s){
        eredmeny.setText(s);
    }
}
