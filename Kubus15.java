import java.util.Scanner;
public class Kubus15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, Lp, vol;
        System.out.println("Masukkan sisi");
        s=input.nextInt();

        Lp=hitungLuasPermukaan(s, s);
        System.out.println("Luas Permukaan Kubus adalah "+Lp);

        vol=hitungVolume(s, s);
        System.out.println("Volume kubus adalah  "+vol);
    }
    static int hitungLuasPermukaan(int sisi, int s){
        int LuasP= (sisi * sisi) * 6;
        return LuasP;
    }
    static int hitungVolume(int sisi, int s){
        int Volume=sisi*sisi*sisi;
        return Volume;
    }
}
