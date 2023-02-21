import java.util.Scanner;
public class Tugas1Perulangan116 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i=0, batasAngka, x = 6;
        

        System.out.print("Masukkan batas angka : ");
        batasAngka = scan.nextInt();
        while (i<batasAngka) {
        i++;
        if (i % x == 0){
            continue;
        }else{
            System.out.print("\t" + i);
        }
       
        }

    }
    
}
