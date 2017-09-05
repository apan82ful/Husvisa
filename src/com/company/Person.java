package com.company;

//Fortsätt i samma program som tidigare uppgift. Skapa upp två hus och tre personer i ditt program.
//Ändra på person-klassen så varje person kan ha ett hem (med referens till huset de bor i. Visa i konsolen
//vilken adress varje person bor på (du får själv välja vilket hus varje person bor i).

//För att kunna koppla ihop en person med ett hus behöver du i din Person-klass ha en variabel av typen Hus.
//private Hus hus; Då kan du antingen via en setter metod eller via konstruktorn tilldela adressen
//till ett redan skapat Hus-objekt till din Person.


public class Person {
    private String namn;
    private String sysselsättning;
    private int ålder;
    private String kön;
    private int längd;
    private Hus hus;

    public Person(){

    }

    public Person(String namn, String sysselsättning, int ålder, String kön, int längd, Hus hus){
        this.setNamn(namn);
        this.setSysselsättning(sysselsättning);
        this.setÅlder(ålder);
        this.setKön(kön);
        this.setLängd(längd);
        this.setHus(hus);
    }


    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getSysselsättning() {
        return sysselsättning;
    }

    public void setSysselsättning(String sysselsättning) {
        this.sysselsättning = sysselsättning;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public String getKön() {
        return kön;
    }

    public void setKön(String kön) {
        this.kön = kön;
    }

    public int getLängd() {
        return längd;
    }

    public void setLängd(int längd) {
        this.längd = längd;
    }

    @Override
    public String toString() {
        return "Namn: " + namn+"," + " Sysselsättning: " + sysselsättning+"," + " Ålder: " + ålder+"," + " kön: "
                + kön+"," + " längd: " + längd+","+"\n" + "Hus: " + hus+"\n";
    }


    public Hus getHus() {
        return hus;
    }

    public void setHus(Hus hus) {
        this.hus = hus;
    }
}
