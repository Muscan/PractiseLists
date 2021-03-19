package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // O lista de strings

        List<String> masini = new ArrayList<>();
        // o lista in care putem salva stringuri
        masini.add("Dacia");
        masini.add("VW");
        masini.add("Tesla");
        masini.add("Citroen");
        masini.add("Audi");

        /*1.cate caractere are fiecare string
        * 2.lunigmea toatala caractere lista
        * 3.lista inversata
        * 4.primul si ultimul string din lista
        * 5.toate Uppercase
        * */
        //4
        //Afiseaza elem de pe pozitia zero, si masini.get(pozitie) din masini.size(lungimea listei
        //-1, indexul ultimei intrari

        System.out.println("Prima si ultima masina sunt: "
                + masini.get(0)+" "+masini.get(masini.size()-1));
        //3
        System.out.println("Lista inversata");
        for(int i=masini.size()-1; i>=0; i--){
            System.out.println("Lungimea totala a stringului "+ masini.get(i).toUpperCase()
                    + " este " +
                    masini.get(i).length());
        }
    }
}
