package com.company;

import java.util.ArrayList;

public class Main {

    //Fortsätt i samma program som tidigare uppgift. Skapa upp två hus och tre personer i ditt program.
    //Ändra på person-klassen så varje person kan ha ett hem (med referens till huset de bor i. Visa i konsolen
    //vilken adress varje person bor på (du får själv välja vilket hus varje person bor i).

    public static void main(String[] args) {
	// write your code here

        HusLista HSL = new HusLista();
        PersonLista PSL = new PersonLista();
        BilLista BSL = new BilLista();

        Bil volvo = new Bil("Volvo", 100000, 30000);
        BSL.add(volvo);
        Bil kia = new Bil("Kia",200000,40000);
        BSL.add(kia);
        Bil saab = new Bil("Saab", 300000,50000);
        BSL.add(saab);

        Hus billigaHuset = new Hus("Valenvägen", 1, 100000, 1945, 45,volvo);
        HSL.add(billigaHuset);
        Hus mellanHuset = new Hus("Hedens byväg", 1, 200000, 1970, 100,kia);
        HSL.add(mellanHuset);
        Hus dyraHuset = new Hus("Rödvägen", 2, 500000, 2000, 200,saab);
        HSL.add(dyraHuset);

        Person person1 = new Person(" Andreas ", "student ", 35, "man", 173, billigaHuset);
        PSL.add(person1);
        Person person2 = new Person("Linda", "Lärare", 31, "Kvinna", 164, mellanHuset);
        PSL.add(person2);
        Person person3 = new Person ("Alexander", "Gamer", 11, "Pojke", 140, dyraHuset);
        PSL.add(person3);
        Person person4 = new Person("Julia", "Konståkare", 8, "Flicka", 135, billigaHuset);
        PSL.add(person4);


        PSL.print();
        System.out.println();
        BSL.print();
        System.out.println();
        HSL.print();
        System.out.println();



        /*System.out.println(billigaHuset);
        System.out.println(mellanHuset);
        System.out.println(dyraHuset);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        System.out.println(volvo);
        System.out.println(kia);
        System.out.println(saab);*/

    }
}
