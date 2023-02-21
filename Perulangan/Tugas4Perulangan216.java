import java.util.Scanner;
public class Tugas4Perulangan216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();
        if(n<5){
            System.out.println("N yang anda masukkan harus lebih dari 5");
        }else{
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print( j);
                } else {
                    System.out.print((n+1) - j);
                }
            }
            System.out.println("");
        }
        }
    }
}
