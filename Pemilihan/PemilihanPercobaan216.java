import java.util.Scanner;
public class PemilihanPercobaan216 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        double rata2;

        System.out.println("Masukkan Nilai 1: ");
        nilai1=input.nextInt();
        System.out.println("Masukkan Nilai 2: ");
        nilai2=input.nextInt();
        rata2= (nilai1 + nilai2) /2;

        if(rata2>=100){
            rata2-=5;
        }
        
        
        System.out.println("Hasil nilai akhir adalah" + rata2);
    
    }

}