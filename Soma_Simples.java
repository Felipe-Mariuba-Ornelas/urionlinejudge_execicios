package br.urionline.judge;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int A, B, SOMA;
        
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        
        SOMA = A+B;
        
        System.out.println("SOMA = "+SOMA);
        
    }
    
}
