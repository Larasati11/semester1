import java.util.Scanner;
public class LatihanPemilihanSegitiga {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int sudut1, sudut2, sudut3;

        System.out.print("Masukkan nilai sudut pertama : ");
        sudut1 = scan.nextInt();
        System.out.print("Masukkan nilai sudut kedua : ");
        sudut2 = scan.nextInt();
        System.out.print("Masukkan nilai sudut ketiga : ");
        sudut3 = scan.nextInt();

        if (sudut1 + sudut2 + sudut3 == 180){
        if (sudut1 == 60 && sudut2 == 60 && sudut3 == 60) {
            System.out.println("Segitiga sama sisi");
            
        } else if(sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
            System.out.println("Segitiga siku siku");
        } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
            System.out.println("Segitiga sama kaki");
        }else {
            System.out.println("Segitiga sembarang");
        }
        }else {
            System.out.println("Jumlah sudut segitiga harus 180");
        }
    
}
}
