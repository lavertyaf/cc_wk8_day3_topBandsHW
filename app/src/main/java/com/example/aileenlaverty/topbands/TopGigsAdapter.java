package com.example.aileenlaverty.topbands;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopGigsAdapter extends ArrayAdapter<Gig> {

    public TopGigsAdapter(Context context, ArrayList<Gig> gigs){
        super(context, 0, gigs);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_gig_list_item, parent, false);
        }

        Gig currentGig = getItem(position);
        TextView ranking = listItemView.findViewById(R.id.rankingTextViewId);
        ranking.setText(currentGig.getRanking().toString());

        TextView band = listItemView.findViewById(R.id.bandNameTextViewId);
        band.setText(currentGig.getBandName().toString());

        TextView gig = listItemView.findViewById(R.id.gigLocationTextViewId);
        gig.setText(currentGig.getGigLocation().toString());

        listItemView.setTag(currentGig);

        return listItemView;
    }
}
