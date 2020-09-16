package br.urionline.judge;

import java.util.Scanner;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        int n, horas;
        double valor, salario;
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();
        
        salario = horas*valor;
        
        System.out.println("NUMBER = "+n);
        System.out.println(String.format("SALARY = U$ %.2f", salario));
    }
    
}
