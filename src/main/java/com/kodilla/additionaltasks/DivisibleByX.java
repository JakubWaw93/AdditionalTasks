
/*
Napisz program, który znajdzie liczby całkowite podzielne przez X (bez reszty) z zakresu od A do B.
 Kluczowy algorytm zamknij w osobnej funkcji/metodzie, która będzie przyjmowała 3 argumenty wejściowe.
  Funkcja ta nie powinna wypisać niczego na ekran. Zamiast tego powinna zwracać kolekcję
   znalezionych elementów w taki sposób, żeby można było ich użyć (odwołać się do nich) w innych częściach programu.
 */

package com.kodilla.additionaltasks;
import java.util.ArrayList;
public class DivisibleByX {

    public static ArrayList<Integer> divFunction(int x, int a, int b){
        ArrayList<Integer> listOfDivisibledByX = new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(i%x==0){
                listOfDivisibledByX.add(i);
            }
        }
        return listOfDivisibledByX;
    }
    public static void main(String[] args) {

        int a =2;
        int b =488;
        int x =12;

        ArrayList<Integer> usableList;
        usableList = divFunction(x,a,b);
        //System.out.println(usableList);
    }

}
