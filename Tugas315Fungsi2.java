import java.util.Scanner;
public class Tugas315Fungsi2 {
    static int n;
    static int CekPrimaRekursif(int a){
        if ((a==1)) {
            return(1);
        } else if(n%a==0){
            return(0);
        }else{
            return (CekPrimaRekursif(a-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        n = sc.nextInt();
        if (n>1) {
            int a = CekPrimaRekursif(n-1);
            if (a==1) {
                System.out.printf("%s Bilangan Prima", n);
            } else {
                System.out.printf("%s Bukan Bilangan Prima", n);
            }
        } else {
            System.out.println("BUKAN BILANGAN PRIMA");
        }
        
    }
}
