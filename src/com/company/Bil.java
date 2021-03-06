package com.company;
//Fortsätt i samma program som tidigare uppgift. Programmera en klass för en bil. Bilen ska ha en modell,
//ett värde och en km-räknare. Låt nu varje hushåll ha en bil (huset har en referens till bilen).
//Visa husen och vilka personer som bor där och vilka bilar som finns där. 2 bilar räcker.
public class Bil {
    private String modell;
    private double värde;
    private int nyvärde;
    private int km;
    private int antalÅr;


    public Bil(){

    }
    public Bil(String modell, double värde, int km){
        this.modell = modell;
        this.värde = värde;
        this.km = km;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public double getVärde() {
        return värde;
    }

    public void setVärde(int värde) {
        this.värde = värde;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    @Override
    public String toString() {
        return "Modell: " + modell + "," + " värde: " + värde + "," + " Km: " + km;
    }

    public void värdeMinskning(int år){
        värde *= Math.pow(0.8, år);
    }

}
