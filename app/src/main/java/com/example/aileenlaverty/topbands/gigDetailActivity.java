package com.example.aileenlaverty.topbands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class gigDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gig_detail);

        Intent intent = getIntent();
        Gig gig = (Gig) intent.getSerializableExtra("gig");

        TextView gigInfoTextView = findViewById(R.id.gigInfoTextViewId);
        gigInfoTextView.setText(gig.getBandName());
    }
}
