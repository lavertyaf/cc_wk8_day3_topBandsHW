package com.example.aileenlaverty.topbands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGigsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_bands);

        TopGigs topGigs = new TopGigs();
        ArrayList<Gig> gigList = topGigs.getList();

        TopGigsAdapter topGigsAdapter = new TopGigsAdapter(this, gigList);
        ListView gigsListView = findViewById(R.id.gigsListViewId);

        gigsListView.setAdapter(topGigsAdapter);

    }

    public void onListItemClick(View listItem){
        Gig gig = (Gig) listItem.getTag();
        Log.d("Band name: ", gig.getBandName());

        Intent intent = new Intent(this, gigDetailActivity.class);
        intent.putExtra("band", gig);
        startActivity(intent);
    }
}
