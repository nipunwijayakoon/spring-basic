package com.app;

public class FullStackCourse implements Course{

    private PriceCalc priceCalc;

    public String duration;


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    FullStackCourse(){
    }

    public void setPriceCalc(PriceCalc priceCalc) {
        this.priceCalc = priceCalc;
    }

    public PriceCalc getPriceCalc() {
        return priceCalc;
    }


    public String getProgramName(){

        return "Full-stack";
    }

    public String getPrice(){

//        return new PriceCalcImpl().showPrice();
        return priceCalc.showPrice();

    }

    public void start(){
        System.out.println("started");
    }

    public void destroyed(){
        System.out.printf("Triggered");
    }
}
