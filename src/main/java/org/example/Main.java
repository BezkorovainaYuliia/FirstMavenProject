package org.example;

import java.util.Scanner;
import com.github.lalyos.jfiglet.FigletFont;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) throws Exception {

        String asciiArt = FigletFont.convertOneLine("Hello, Kumpel!");
        System.out.println(ANSI_RED + asciiArt + ANSI_RESET);
        //
        System.out.println("Wie ist dein Name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            myName(name);
        }
        //
        System.out.println("Wählen Sie die Zahl und ich sage, ob sie glößer als 0 ist:");
        int nummer = sc.nextInt();
        System.out.println("Ist die Zahl " + nummer + " is größer als 0 " + ANSI_RED + isMehrAls0(nummer) + ANSI_RESET);
        //
        System.out.println("Wählen Sie die Zahl und ich berechne das Quadrat ");
        double dNummer = sc.nextDouble();
        System.out.println(square(dNummer));
        //
        System.out.println("Wie ist dein Name?");
        name = sc.next();
        System.out.println("Hallodrio, " + name);

        sc.close(); ///
    }

    public static void myName(String name) {
        System.out.println(name);
    }

    public static boolean isMehrAls0(int nummer) {
        return nummer >= 0;
    }

    public static double square(double nummer) {
        return Math.pow(nummer, 2);
    }
}