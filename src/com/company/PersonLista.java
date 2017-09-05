package com.company;

public class PersonLista {
    private Person[] lista = new Person[4];

    private int i = 0;

    public void add(Person person1) {
        if (i < lista.length) {
            lista[i] = person1;
            i++;
            //System.out.println("person lagt på index " + i);

        }
    }
    public Person get(int i){
        return lista[i];
    }

    public void print() {
        for (int j = 0; j < i; j++) {
            System.out.println(lista[j]);
        }

    }
}



