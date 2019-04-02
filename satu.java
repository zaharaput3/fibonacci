/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Praktikan
 */
public class Satu {

public static void main(String[] args) throws IOException {
      BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int banyakBilangan = 0;
        int a = 1;
        int b = 1;
        int c;
        int i;
        System.out.println("Bilangan Fibonacci");
        System.out.print("Masukkan banyak bilangan = ");
        try {
            input = dataInput.readLine();
            banyakBilangan = Integer.parseInt(input);
        } catch (NumberFormatException error) {
            System.out.println("Error !!");
        }
        System.out.print("Bilangan Fibonacci = " + a + " " + b + " ");
        for (i = 0; i < banyakBilangan - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");
    }
    
}
