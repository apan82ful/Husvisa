package com.company;

public class BilLista {
    private Bil[] lista = new Bil[3];

    int i;

    public BilLista(){
        this.lista = lista;
    }

    public void add(Bil volvo){
        if(i<lista.length) {
            lista[i] = volvo;
            i++;

            //System.out.println("Bil " + volvo + " lagt på index " + i);
        }

    }

    public Bil get(int i){
        return lista[i];
    }

    public void print(){
        for (int j = 0; j < i; j++) {
            System.out.println(lista[j]);

        }
    }
}