import java.util.Scanner;
public class TugasPemilihan316 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        double nilaiAkhir, uas, uts, kuis, tugas;
        
        System.out.println("Masukkan nilai uas: ");
        uas=input.nextDouble();
        System.out.println("Masukkan nilai uts: ");
        uts=input.nextDouble();
        System.out.println("Masukkan nilai kuis: ");
        kuis=input.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        tugas=input.nextDouble();

        uas*=0.4;
        uts*=0.3;
        kuis*=0.1;
        tugas*=0.2;

        nilaiAkhir= uas + uts + kuis + tugas;
        System.out.println("Nilai Rata Rata: " + nilaiAkhir);
        if(nilaiAkhir<65){
           System.out.println("Remidi");
        }
        else{
           System.out.println("Tidak Remidi");
        }
       
    
    }

}