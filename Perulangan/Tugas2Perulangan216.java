import java.util.Scanner;
public class Tugas2Perulangan216 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = input.nextInt();
        if(n<5){
            System.out.println("N yang anda masukkan minimal 5");
        }else{
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
}
