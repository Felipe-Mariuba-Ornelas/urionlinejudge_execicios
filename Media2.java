package media2;

import java.util.Scanner;

import java.util.Locale;

public class Media2 {

    public static void main(String[] args) {
        double A, B, C, MEDIA;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        MEDIA = (A*0.2) + (B*0.3) + (C*0.5);
        
        System.out.println(String.format("MEDIA = %.1f", MEDIA));
        
    }
    
}
