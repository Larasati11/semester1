import java.util.Scanner;
public class LatihanPerulanganKecepatan {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        double s = 0.0, v = 2.0, t, waktuTempuh;
        //v kecepatan
        //s jarak
        //t waktu
        System.out.println("Masukkan berapa detik waktu yang ingin ditempuh :");
        waktuTempuh = scan.nextDouble();
        for ( t = 1; t <= waktuTempuh; t++) 
        {
            s = s + v;
            v = v + 0.1;
            
        }
        waktuTempuh = waktuTempuh / 60;
        System.out.println("Jadi jarak yang ditempuh dengan waktu " + waktuTempuh + " menit adalah " + s);
        


        
    }
}
