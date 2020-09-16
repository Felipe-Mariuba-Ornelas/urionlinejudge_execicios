package br.urionline.judge;

import java.util.Scanner;
import java.util.Locale;


public class Principal {
    public static void main(String[] args) {
     int cpeca1, cpeca2, qpeca1, qpeca2;
     double vpeca1, vpeca2, custoTotal;
     
     Locale.setDefault(Locale.US);
     
     Scanner sc = new Scanner(System.in);
     
     cpeca1 = sc.nextInt();
     qpeca1 = sc.nextInt();
     vpeca1 = sc.nextDouble();
     
     cpeca2 = sc.nextInt();
     qpeca2 = sc.nextInt();
     vpeca2 = sc.nextDouble(); 
     
     custoTotal = qpeca1*vpeca1 + qpeca2*vpeca2;
     
     System.out.println(String.format("VALOR A PAGAR: R$ %.2f", custoTotal));

    }
    
}
