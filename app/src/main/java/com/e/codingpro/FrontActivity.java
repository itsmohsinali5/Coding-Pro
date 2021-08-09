package com.e.codingpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FrontActivity extends AppCompatActivity {

    LinearLayout cplus , data, sort, edit;
    TextView tv_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        cplus = findViewById(R.id.cpp);
        data = findViewById(R.id.dsa);
        sort = findViewById(R.id.sortingAlgo);
        edit = findViewById(R.id.editor);
        tv_help = findViewById(R.id.help);

        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FrontActivity.this, Cpp.class);
                startActivity(a);
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FrontActivity.this, Dsa.class);
                startActivity(a);
            }
        });

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FrontActivity.this, Sorting.class);
                startActivity(a);
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FrontActivity.this, Editor.class);
                startActivity(a);
            }
        });

        tv_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FrontActivity.this, HelpActivity.class);
                startActivity(a);
            }
        });
    }
}
