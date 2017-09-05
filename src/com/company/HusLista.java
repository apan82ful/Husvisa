package com.company;

public class HusLista {
    private Hus[] lista = new Hus[3];

    private int i = 0;

    public void add(Hus billigahuset) {
        if (i < lista.length) {
            lista[i] = billigahuset;
            i++;
            //System.out.println("hus lagt på index " + i);

        }
    }
    public Hus get(int i){
        return lista[i];
    }


    public void print() {
        for (int j = 0; j < i; j++) {
            System.out.println(lista[j]);
        }
    }

}

