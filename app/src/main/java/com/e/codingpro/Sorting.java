package com.e.codingpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Sorting extends AppCompatActivity {

    Button btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38;
    TextView tv31, tv32, tv33, tv34, tv35, tv36, tv37, tv38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting);

        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn35 = findViewById(R.id.btn35);
        btn36 = findViewById(R.id.btn36);
        btn37 = findViewById(R.id.btn37);
        btn38 = findViewById(R.id.btn38);

        tv31 = findViewById(R.id.tv31);
        tv32 = findViewById(R.id.tv32);
        tv33 = findViewById(R.id.tv33);
        tv34 = findViewById(R.id.tv34);
        tv35 = findViewById(R.id.tv35);
        tv36 = findViewById(R.id.tv36);
        tv37 = findViewById(R.id.tv37);
        tv38 = findViewById(R.id.tv38);

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s31.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv31.setText(text);

                if(tv31.getVisibility() == View.VISIBLE)
                {
                    tv31.setVisibility(View.GONE);
                }
                else
                {
                    tv31.setVisibility(View.VISIBLE);
                }
            }
        });

        // Button 2 clicked

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s32.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv32.setText(text);

                if(tv32.getVisibility() == View.VISIBLE)
                {
                    tv32.setVisibility(View.GONE);
                }
                else
                {
                    tv32.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 3 clicked

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s33.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv33.setText(text);

                if(tv33.getVisibility() == View.VISIBLE)
                {
                    tv33.setVisibility(View.GONE);
                }
                else
                {
                    tv33.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 4 clicked

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s34.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv34.setText(text);

                if(tv34.getVisibility() == View.VISIBLE)
                {
                    tv34.setVisibility(View.GONE);
                }
                else
                {
                    tv34.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 5 clicked

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s35.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv35.setText(text);

                if(tv35.getVisibility() == View.VISIBLE)
                {
                    tv35.setVisibility(View.GONE);
                }
                else
                {
                    tv35.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 6 clicked

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s36.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv36.setText(text);

                if(tv36.getVisibility() == View.VISIBLE)
                {
                    tv36.setVisibility(View.GONE);
                }
                else
                {
                    tv36.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 7 clicked

        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s37.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv37.setText(text);

                if(tv37.getVisibility() == View.VISIBLE)
                {
                    tv37.setVisibility(View.GONE);
                }
                else
                {
                    tv37.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 8 clicked

        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("s38.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv38.setText(text);

                if(tv38.getVisibility() == View.VISIBLE)
                {
                    tv38.setVisibility(View.GONE);
                }
                else
                {
                    tv38.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}
