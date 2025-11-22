/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e_x_1;
import java.util.Scanner;
public class E_X_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n of Matrix:");
        int n = s.nextInt();
        
        int[][] a = new int[n][n];
        
        System.out.println("Enter Matrix Elements Row By Row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        
        System.out.println("\nUpper Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i <= j) {
                    System.out.print(a[i][j] +" "); 
                } else {
                    System.out.print("0 "); 
                }
            }
            System.out.println(); 
        }
        

        System.out.println("\nLower Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i >= j) {
                    System.out.print(a[i][j] +" ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); 
        }
        
        s.close();
    }
}
