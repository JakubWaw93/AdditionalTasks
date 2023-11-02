
/* Dane są dwie zmienne: a o wartości 5, b o wartości 7.
Napisz program, który podmieni te dwie wartości miejscami tak, żeby w zmiennej a znajdowała się wartość 7,
 a w zmiennej b wartość 5. Nie należy ograniczać się do wartości 5 i 7,
  program powinien obsługiwać liczby całkowite większe lub równe 0 (zbiór liczb naturalnych).
**UWAGA: ** W programie możesz stworzyć tylko i wyłącznie te dwie zmienne (nie możesz tworzyć nowych zmiennych).

 */
package com.kodilla.additionaltasks;

public class ReplaceWithoutTemp {

    public static void replace(double a, double b) {
        System.out.println("a = " + a + " b = " + b);
        if (a >= 0 && b >= 0 && a == (int)a && b == (int)b ) {
            a = b + a;
            b = a - b;
            a = a - b;
            System.out.println("Po zamianie a = " + a + " b = " + b);
        } else {
            System.out.println("Conajmniej jedna z liczb nie jest liczbą naturalną!");
        }

    }
    public static void main(String[] args) {
        double a=5;
        double b=7;
        ReplaceWithoutTemp.replace(a,b);
    }
}
