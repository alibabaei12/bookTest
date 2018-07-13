package com.example.ali.booktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PostActivity extends AppCompatActivity {


    private EditText title;
    private Button postButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        //Set the Edit texts and buttons to their ID so we can use it in java
        title = (EditText) findViewById(R.id.titleEditTextID);
        postButton = (Button) findViewById(R.id.postButtonID);


        //after clicking the post button it will post to the fire base database

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}
