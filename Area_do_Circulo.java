package br.urionline.judge;

import java.util.Scanner;


public class Area_do_Circulo {

    public static void main(String[] args) {
        double  n, raio;
        double  area;
        n = 3.14159;
        
        Scanner sc = new Scanner(System.in);
        
        raio = sc.nextDouble();

        area = (n* Math.pow(raio,2));
        
        System.out.println(String.format("A=%.4f", area));
        
    }
    
}
