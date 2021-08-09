package com.e.codingpro;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Cpp extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp);

        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btn10 = findViewById(R.id.ten);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);

                                    // Button 1 clicked

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("1.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv1.setText(text);

                if(tv1.getVisibility() == View.VISIBLE)
                {
                    tv1.setVisibility(View.GONE);
                }
                else
                {
                    tv1.setVisibility(View.VISIBLE);
                }

            }
        });

                                    // Button 2 clicked

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("2.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv2.setText(text);

                if(tv2.getVisibility() == View.VISIBLE)
                {
                    tv2.setVisibility(View.GONE);
                }
                else
                {
                    tv2.setVisibility(View.VISIBLE);
                }

            }
        });

                                        // Button 3 clicked

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("3.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv3.setText(text);

                if(tv3.getVisibility() == View.VISIBLE)
                {
                    tv3.setVisibility(View.GONE);
                }
                else
                {
                    tv3.setVisibility(View.VISIBLE);
                }

            }
        });

                                    // Button 4 clicked

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("4.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv4.setText(text);

                if(tv4.getVisibility() == View.VISIBLE)
                {
                    tv4.setVisibility(View.GONE);
                }
                else
                {
                    tv4.setVisibility(View.VISIBLE);
                }

            }
        });

                                        // Button 5 clicked

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("5.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv5.setText(text);

                if(tv5.getVisibility() == View.VISIBLE)
                {
                    tv5.setVisibility(View.GONE);
                }
                else
                {
                    tv5.setVisibility(View.VISIBLE);
                }

            }
        });

                                            // Button 6 clicked

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("6.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv6.setText(text);

                if(tv6.getVisibility() == View.VISIBLE)
                {
                    tv6.setVisibility(View.GONE);
                }
                else
                {
                    tv6.setVisibility(View.VISIBLE);
                }

            }
        });

                                        // Button 7 clicked

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("7.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv7.setText(text);

                if(tv7.getVisibility() == View.VISIBLE)
                {
                    tv7.setVisibility(View.GONE);
                }
                else
                {
                    tv7.setVisibility(View.VISIBLE);
                }

            }
        });

                                // Button 8 clicked

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("8.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv8.setText(text);

                if(tv8.getVisibility() == View.VISIBLE)
                {
                    tv8.setVisibility(View.GONE);
                }
                else
                {
                    tv8.setVisibility(View.VISIBLE);
                }

            }
        });

                                    // Button 9 clicked

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("9.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv9.setText(text);

                if(tv9.getVisibility() == View.VISIBLE)
                {
                    tv9.setVisibility(View.GONE);
                }
                else
                {
                    tv9.setVisibility(View.VISIBLE);
                }

            }
        });

                                    // Button 10 clicked

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("10.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv10.setText(text);

                if(tv10.getVisibility() == View.VISIBLE)
                {
                    tv10.setVisibility(View.GONE);
                }
                else
                {
                    tv10.setVisibility(View.VISIBLE);
                }

            }
        });


    }
}
