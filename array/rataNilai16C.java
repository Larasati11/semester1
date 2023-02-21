import java.util.Scanner;
public class rataNilai16C {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double total1=0;
        double total2=0;
        double rata1, rata2;
        double jmlLulus= 0, jmlTidakLulus = 0;
        System.out.print("Masukkan jumlah Mahasiswa : " );
        int jmlMHS= sc.nextInt();
        int[] nilaiMHS = new int[jmlMHS];
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
            nilaiMHS[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMHS.length; i++) {
            if (nilaiMHS[i] > 70) {
                total1+=nilaiMHS[i];
                jmlLulus++;
            }else{
            total2+=nilaiMHS[i];
            jmlTidakLulus++;
            }
        }

        rata1= total1/jmlLulus;
        rata2= total2/jmlTidakLulus;
        System.out.println("Nilai rata rata yang lulus : " + rata1);
        System.out.println("Nilai rata rata yang tidak lulus : " + rata2);
    }
    
}
