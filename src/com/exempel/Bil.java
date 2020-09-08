package com.exempel;

public class Bil {

    private String literMil;
    private String farg;
    private String hastighet;
    private String arsModel;

    public Bil(String literMil, String farg, String hastighet, String arsModel){
        this.literMil = literMil;
        this.farg = farg;
        this.hastighet = hastighet;
        this.arsModel = arsModel;
    }

    public String getHastighet() {
        return hastighet;
    }

    public void setFarg(String farg) {
        this.farg = farg;
    }

    public String getFarg() {
        return farg;
    }

    public String bilInfo(){

        return "Din" + "namn" + "\nHastighet: " + hastighet + "km/h.\nLiter per mil: "
                + literMil + "\nFärg: " + farg + "\nÅrsmodel: " + arsModel;
    }
}
