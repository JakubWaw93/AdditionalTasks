/*Napisz program, który wypisze wszystkie liczby podzielne przez 4 bez reszty
 z zakresu od 0 do 100 (obustronnie włącznie). Bez użycia instrukcji warunkej.
 */

package com.kodilla.additionaltasks;

public class DivisibleBy4WithoutIf {

    public void divisibleBy4(){
        System.out.println("Numbers divisible by '4' from range 0-100: ");
            for(int i=0; i<=100; i+=4){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        DivisibleBy4WithoutIf divB4 = new DivisibleBy4WithoutIf();
        divB4.divisibleBy4();
    }
}
