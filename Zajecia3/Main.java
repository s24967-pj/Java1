package com.company;

import java.util.ArrayList;

import static java.lang.Math.sqrt;


public class Main {

    public static void main(String[] args) {
        // oczywiście ma też działać po zmianie tych wartości
        double bok1 = 1, bok2 = 2;
        Prostokat prostokat1 = new Prostokat(bok1, bok2);
        Kwadrat prostokat2 = new Kwadrat(bok1, bok1);
        Prostokat prostokat3 = new Kwadrat(bok1);

        if (prostokat2.przekatna(2) == prostokat3.przekatna(2))
            System.out.println("To powinno się wydrukować 1 (za 1 p.)");

        if (prostokat1.przekatna(2.5) == (Math.sqrt((bok1 * bok1) + (bok2 * bok2)) * 2.5))
            System.out.println("To powinno się wydrukować 2 (za 1 p.)");
        if ((int) (bok1 * Math.sqrt(2) * 2) == prostokat3.przekatna(2))
            System.out.println("To powinno się wydrukować 3 (za 2 p.)");
        if (!prostokat1.equals(prostokat2))
            System.out.println("To powinno się wydrukować 4 (za 1 p.)");
        ArrayList lista1 = new ArrayList();
        lista1.add(prostokat1);
        lista1.add(prostokat2);
        lista1.add(prostokat3);
        lista1.remove(prostokat3);
        if (lista1.contains(prostokat3))
            System.out.println("To powinno się wydrukować 5 (za 2 p.)");
    }

    private static class Kwadrat extends Prostokat {
        double bok1 = 1d; 
        double bok2 = 2d;
        double przekatna;

        public Kwadrat(double bok1, double bok11) {
            super(bok1, bok11);    double x = Math.pow(bok1, bok2);
            this.przekatna = sqrt(x);
        }


        public Kwadrat(double bok1) {
            super(bok1);
        }

    }

    public static class Prostokat {
        double przekatna;

        public Prostokat(double bok1, double bok2) {
        }

        public Prostokat(double bok1) {
        }

        public double Prostokat(double bok1, double bok2) {
            double x = Math.pow(bok1, bok2);
            this.przekatna = sqrt(x);
            return this.przekatna;
        }
        public double Kwadrat (double bok1)
          {
              this.przekatna = sqrt(bok1);
              return this.przekatna;
            }

//            public double przekatna (prostokat, double bok1)
//            {
//                // prostokat3;
//                Prostokat prostokat3;
//                (int) (bok1 * Math.sqrt(2) * 2) == prostokat3.przekatna(2);
//                return bok1;
//            }


        public double przekatna(double i) {
            return 0;
        }
    }

}

