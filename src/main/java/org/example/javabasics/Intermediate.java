package org.example.javabasics;

import java.util.Scanner;

public class Intermediate {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        String[] zahlen = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
        printZahl(zahlen, 2);


        String[] array100 =  new String[100];
        double current = 1;
        for (int i = 0; i < 100; i++) {

            array100[i] = String.valueOf((int) current);

            if ((current % 3) == 0)
            {
                array100[i] = "#";
            }
            if ((current % 5) == 0){
                array100[i] = "$";
            }
            if (((current % 3) == 0)&&((current % 5) == 0)){
                array100[i] = "#$";
            }
            System.out.print(array100[i] + "\t");
            current ++;
        }

        System.out.println("Sage ihre Namen: ");
        Scanner sc = new Scanner(System.in);
        String [] namen = new String [5];
        namen[0] = sc.nextLine();
        System.out.println(namen[0]);
        int i = 1;
        do{
            namen[i] = sc.nextLine();
            System.out.println(namen[i]);
            i++;
        }while(i < namen.length);

    }

    public static void printZahl(String[] zahlen, int zahl) {
        //oder SWITCH
        //oder Equals
        for(int i = 0; i < zahlen.length; i++) {
            if (zahl == i + 1)
                System.out.println("Die Zahl " +
                        ANSI_RED + zahlen[i] + ANSI_RESET +
                        " ist in Arabic " +
                        ANSI_RED + (i + 1) + ANSI_RESET);
        }
    }
}
