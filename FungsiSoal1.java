import java.util.Scanner;
public class FungsiSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan lebar: ");
        l=input.nextInt();
        System.out.print("Masukkan panjang: ");
        p=input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t=input.nextInt();

        L=hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah "+ L);

        vol=hitungVolume(p, l, t);
        System.out.println("Volume balok adalah  "+vol);
    }
    static int hitungLuas(int pj, int lb){
        int luas = pj * lb;
        return luas;
    }
    static int hitungVolume(int pj, int lb, int tg){
        int volume = pj * lb * tg;
        return volume;
    }
}
