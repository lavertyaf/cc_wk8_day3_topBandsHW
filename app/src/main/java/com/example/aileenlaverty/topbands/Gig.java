package com.example.aileenlaverty.topbands;


import java.io.Serializable;

public class Gig implements Serializable {

    private Integer ranking;
    private String bandName;
    private String gigLocation;

    public Gig(Integer ranking, String bandName, String gigLocation) {
        this.ranking = ranking;
        this.bandName = bandName;
        this.gigLocation = gigLocation;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getBandName() {
        return bandName;
    }

    public String getGigLocation() {
        return gigLocation;
    }

}
