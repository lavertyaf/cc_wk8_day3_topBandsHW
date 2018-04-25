package com.example.aileenlaverty.topbands;


import java.util.ArrayList;

public class TopGigs {

    private ArrayList<Gig> list;

    public TopGigs() {
        list = new ArrayList<Gig>();
        list.add(new Gig(1, "Frightened Rabbit", "The Picture House, Edinburgh"));
        list.add(new Gig(2, "FatherSon", "O2 ABC, Glasgow"));
        list.add(new Gig(3, "Biffy Clyro", "O2 Academy, Glasgow"));
        list.add(new Gig(4, "Travis", "T in The Park, Kinross"));
        list.add(new Gig(5, "Withered Hand", "Liquid Rooms"));
        list.add(new Gig(6, "Fanage", "The Haven, Anstruther"));
        list.add(new Gig(7, "Foo Fighters", "Murrayfield, Edinburgh"));
        list.add(new Gig(8, "King Creosote", "Harbour Masters Office, Pittenweem"));
        list.add(new Gig(9, "Scott Hutchison", "The Grange, Edinburgh"));
        list.add(new Gig(10, "Take That", "Hamden, Glasgow"));

    }

    public ArrayList<Gig> getList() {
        return new ArrayList<Gig>(list);
    }

}
