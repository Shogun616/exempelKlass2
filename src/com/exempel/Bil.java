package com.exempel;

public class Bil {

    private String literMil;
    private String farg;
    private String hastighet;

    public Bil(String literMil, String farg, String hastighet){
        this.literMil = literMil;
        this.farg = farg;
        this.hastighet = hastighet;
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

    public String bilInfo(String namn){
        String text = "Din" + "namn" + "\nHastighet: " + hastighet + "km/h.\nLiter per mil: "
                + literMil + "\nFärg: " + farg;

        return text;
    }
}
