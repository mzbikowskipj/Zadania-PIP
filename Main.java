package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        // zadanie 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie:");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj plec:");
        String plec = scanner.nextLine();
        Wypisz(imie, nazwisko, plec);



        //zadanie 2

        System.out.println("Podaj miesiąc");
        int liczba= scanner.nextInt();
        System.out.println("Podaj rok");
        int rok=scanner.nextInt();
        Wypisz2(liczba, rok);



        // zadanie 3

        if( ( rok % 4 == 0 && rok % 100 != 0 ) || rok % 400 == 0 ) {
            System.out.println("Rok " + rok + " jest przestepny");
        } else {
            System.out.println("Rok" + rok + "nie jest przestepny");
        }


        // zadanie 4

        int iloscSztuk = scanner.nextInt();
        boolean promocja=true;
        double cena= 10;

        if (promocja){
            if( iloscSztuk > 10 ){
                cena /= 2.0;
            }
        } else {
            cena *= 1.1;
        }

        double koszt = cena * iloscSztuk;
        System.out.println("Koszt: " + koszt + ",-");



        //zadanie 5

        scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł pierwszego utowu:");
        String tytul=scanner.nextLine();
        System.out.println("Podaj czas trwania pierwzego utoru (minuty)");
        int minuty=scanner.nextInt();
        System.out.println("Podaj tytuł pierwszego utowu (sekundy)");
        int sekundy=scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł drugiego utowu:");
        String tytul2=scanner.nextLine();
        System.out.println("Podaj czas trwania drugiego utoru (minuty)");
        int minuty2=scanner.nextInt();
        System.out.println("Podaj tytuł drugiego utowu (sekundy)");
        int sekundy2=scanner.nextInt();

        System.out.println("--------------------------------------------------------------");
        System.out.println("UTWORY:");

        if (minuty<minuty2 ||( minuty==minuty2 && sekundy<sekundy2)) {
            System.out.println("1. "+tytul+" "+ minuty +":"+sekundy);
            System.out.println("2. "+tytul2+" "+ minuty2 +":"+sekundy2);
        }
        else {
            System.out.println("1. "+tytul2+" "+ minuty2 +":"+sekundy2);
            System.out.println("2. "+tytul+" "+ minuty +":"+sekundy);
        }
        if (sekundy+sekundy2>59){
            System.out.println("Laczny czas trwania: " + (minuty+minuty2+1)+ ":" + (sekundy+sekundy2-59) );
        }
        else{
            System.out.println("Laczny czas trwania: " + (minuty+minuty2)+ ":" + (sekundy+sekundy2) );
        }
        System.out.println("--------------------------------------------------------------");



        // zadanie 6

        System.out.println("Podaj dlugości bokow");
        double a = scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();

        if (a+b>c && b+c>a && a+c>b){
            if (a==b && c==a){
                System.out.println("Rownoboczny");
            }
            else if( (a==b  && c!=b) || (c==b && c!=a) || (a==c && c!=b) ){
                System.out.println("Rownoramienny");
            }
            else if ( Math.pow(a,2.0) + Math.pow(b,2.0) == Math.pow(c,2.0)
                    || Math.pow(b,2.0) + Math.pow(c,2.0) == Math.pow(a,2.0)
                    || Math.pow(c,2.0) + Math.pow(a,2.0) == Math.pow(b,2.0)
            ){
                System.out.println("Trojkat prosty");
            }
        } else {
            System.out.println("Z bokow ABC nie da sie utworzyc trojkata");
        }
    }

    public static void Wypisz(String imie, String nazwisko, String plec) {
        if (plec.contains("M")) {
            System.out.println("Student: " + imie + " " + nazwisko);
        } else if (plec.contains("K")) {
            System.out.println("Studentka: " + imie + " " + nazwisko);
        }
    }

    public static void Wypisz2( int liczba, int rok) {
        if (liczba<=3)
            System.out.println(liczba+"."+rok+ " to I kwartał "+ rok+ " roku");
        if (liczba> 3 && liczba <=6)
            System.out.println(liczba+"."+rok+ " to II kwartał "+ rok+ " roku");
        if (liczba>6 && liczba<=9)
            System.out.println(liczba+"."+rok+ " to III kwartał "+ rok+ " roku");
        if (liczba>9 && liczba<=12)
            System.out.println(liczba+"."+rok+ " to IV kwartał "+ rok+ " roku");
    }
}












