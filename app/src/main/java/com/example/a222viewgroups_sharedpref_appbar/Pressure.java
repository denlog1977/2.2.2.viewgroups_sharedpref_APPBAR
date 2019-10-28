package com.example.a222viewgroups_sharedpref_appbar;


public class Pressure {

    int upPressure;
    int downPressure;
    int pulse;
    boolean tachycardia;
    String date;

    public Pressure(int upPressure, int downPressure, int pulse, boolean tachycardia, String date) {
        this.upPressure = upPressure;
        this.downPressure = downPressure;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.date = date;
    }

    @Override
    public String toString() {
        String t;
        t = (tachycardia) ? ", Тахикардия!" : "";
        return "Показатели давления на дату " + date + ": " +
                "верхнее " + upPressure +
                ", нижнее " + downPressure +
                ", пульс " + pulse +
                "" + t;
    }
}
