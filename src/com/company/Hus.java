package com.company;

//Programmera en klass som representerar ett hus. Huset ska ha en yta, antal våningar, värde, byggnadsår
//och en adress. Skriv ett program som visar detta i konsolen.

public class Hus {
    private int yta;
    private int våningar;
    private int värde;
    private int byggnadsår;
    private String adress;
    private Bil bil;


    public Hus(){

    }

    public Hus(String adress, int våningar, int värde, int byggnadsår, int yta, Bil bil){
        this.setYta(yta);
        this.setVåningar(våningar);
        this.setVärde(värde);
        this.setByggnadsår(byggnadsår);
        this.setAdress(adress);
        this.setBil(bil);
    }

    public int getYta() {
        return yta;
    }

    public void setYta(int yta) {
        this.yta = yta;
    }

    public int getVåningar() {
        return våningar;
    }

    public void setVåningar(int våningar) {
        this.våningar = våningar;
    }

    public int getVärde() {
        return värde;
    }

    public void setVärde(int värde) {
        this.värde = värde;
    }

    public int getByggnadsår() {
        return byggnadsår;
    }

    public void setByggnadsår(int byggnadsår) {
        this.byggnadsår = byggnadsår;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Adress: " + adress+"," + " våningar: " + våningar+"," + " värde: " + värde+"," + " byggnadsår: " + byggnadsår+"," + "yta: " + yta+",";
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }
}
