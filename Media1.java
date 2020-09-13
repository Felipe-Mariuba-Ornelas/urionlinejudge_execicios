package br.urionline.judge;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       double A, B, MEDIA;
       
       Locale.setDefault(Locale.US);
       
       Scanner sc = new Scanner(System.in);
       
       A = sc.nextDouble();
       B = sc.nextDouble();
       
       MEDIA = (A*3.5 + B*7.5)/11.0;
  
       System.out.println(String.format("MEDIA = %.5f", MEDIA));
       
    }
    
}
