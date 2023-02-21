import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class TriangleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        System.out.println("--Segitiga Siku-Siku Dikiri--");
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println("--Segitiga siku-siku terbalik--");

        for (int i = 0; i <N ; i++) {
            for (int j = 0+i; j<N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println("--Segitiga siku siku dikanan--");

        for (int i = 0; i <= N ; i++) {
            for (int j = 0 ; j < N-i; j++) {
            System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
            System.out.print("*");
            }
            System.out.println("");
        }
System.out.println("--Segitiga siku siku dikanan terbalik--");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = N; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println("--Segitiga Bentuk Piramida--");
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
            System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
            System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) {
            System.out.print("*");
            }
            System.out.println("");
        }
System.out.println("--Segitiga Bentuk Piramida Terbalik--");
        for (int i = 1; i <= N ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k >= (i-N); k--) {
                System.out.print("*");
            }
            for (int k = 0; k < (N-i); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
System.out.println("--Segitiga Diamond--");
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
            System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
            System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) {
            System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= N ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k >= (i-N); k--) {
                System.out.print("*");
            }
            for (int k = 0; k < (N-i); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
