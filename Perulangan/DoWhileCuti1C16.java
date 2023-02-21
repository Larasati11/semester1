import java.util.Scanner;
public class DoWhileCuti1C16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cuti = 5;
        char konfirmasi;

        do {
            System.out.print("Apakah anda menggunakan jatah cuti 1 hari (y/t)? ");
            konfirmasi = scan.next().charAt(0);
            if (konfirmasi == 'y' || konfirmasi == 'Y') {
                cuti--;
                System.out.printf("Sisa %d hari\n", cuti);
                if (cuti==2) {
                    System.out.println("STOP! Jatah cuti anda tinggal 2 hari" );
                    break;
                }
            }else {
                System.out.printf("Jatah cuti anda sisa %d hari\n", cuti);
                break;
            }
        } while (cuti > 0);
    }
    
}
