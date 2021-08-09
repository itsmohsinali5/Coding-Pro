package com.e.codingpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class Dsa extends AppCompatActivity {

    Button btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28;
    TextView tv21, tv22, tv23, tv24, tv25, tv26, tv27, tv28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsa);

        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);

        tv21 = findViewById(R.id.tv21);
        tv22 = findViewById(R.id.tv22);
        tv23 = findViewById(R.id.tv23);
        tv24 = findViewById(R.id.tv24);
        tv25 = findViewById(R.id.tv25);
        tv26 = findViewById(R.id.tv26);
        tv27 = findViewById(R.id.tv27);
        tv28 = findViewById(R.id.tv28);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d21.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv21.setText(text);

                if(tv21.getVisibility() == View.VISIBLE)
                {
                    tv21.setVisibility(View.GONE);
                }
                else
                {
                    tv21.setVisibility(View.VISIBLE);
                }
            }
        });

        // Button 2 clicked

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d22.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv22.setText(text);

                if(tv22.getVisibility() == View.VISIBLE)
                {
                    tv22.setVisibility(View.GONE);
                }
                else
                {
                    tv22.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 3 clicked

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d23.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv23.setText(text);

                if(tv23.getVisibility() == View.VISIBLE)
                {
                    tv23.setVisibility(View.GONE);
                }
                else
                {
                    tv23.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 4 clicked

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d24.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv24.setText(text);

                if(tv24.getVisibility() == View.VISIBLE)
                {
                    tv24.setVisibility(View.GONE);
                }
                else
                {
                    tv24.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 5 clicked

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d25.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv25.setText(text);

                if(tv25.getVisibility() == View.VISIBLE)
                {
                    tv25.setVisibility(View.GONE);
                }
                else
                {
                    tv25.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 6 clicked

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d26.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv26.setText(text);

                if(tv26.getVisibility() == View.VISIBLE)
                {
                    tv26.setVisibility(View.GONE);
                }
                else
                {
                    tv26.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 7 clicked

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d27.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv27.setText(text);

                if(tv27.getVisibility() == View.VISIBLE)
                {
                    tv27.setVisibility(View.GONE);
                }
                else
                {
                    tv27.setVisibility(View.VISIBLE);
                }

            }
        });

        // Button 8 clicked

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                try{
                    InputStream inputStream = getAssets().open("d28.txt");
                    int size = inputStream.available();
                    byte[] buffer = new byte[size];
                    inputStream.read(buffer);
                    inputStream.close();
                    text = new String(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv28.setText(text);

                if(tv28.getVisibility() == View.VISIBLE)
                {
                    tv28.setVisibility(View.GONE);
                }
                else
                {
                    tv28.setVisibility(View.VISIBLE);
                }

            }
        });


    }
}
