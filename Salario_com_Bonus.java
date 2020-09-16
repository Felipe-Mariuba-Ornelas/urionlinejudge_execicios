package br.urionline.judge;

import java.util.Scanner;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
       
        String Nome;
        double salario, tvendas, total;
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        Nome = sc.next();
        salario = sc.nextDouble();
        tvendas = sc.nextDouble();
        total = salario + (tvendas*0.15);
        
        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
    
}
