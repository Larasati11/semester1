import java.util.Scanner;

public class Tugas2Pemilihan216{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, sisi, alas, tinggi, jari, tinggi2;
        double luas, volume;
        char submenu1;
        String jenisBangun;
        boolean ulangi = true;
        

        while(ulangi==true){
        System.out.println("==============================================================");
        System.out.print("Apakah yang akan anda hitung? (1) Luas atau (2) Volume ? ");
        menu = sc.nextInt();
        if (menu==1){
            System.out.print("Bentuk bangun apa ? (a) Persegi atau (b) Segitiga ? ");
            submenu1 = sc.next().charAt(0);
            if(submenu1=='a'){
                jenisBangun = "Persegi";
                System.out.print("Inputkan sisi: ");
                sisi = sc.nextInt();
                luas = sisi * sisi;
            }else{
                jenisBangun = "Segitiga";
                System.out.print("Inputkan alas: ");
                alas = sc.nextInt();
                System.out.print("Inputkan tinggi: ");
                tinggi = sc.nextInt();
                luas = 0.5 * alas * tinggi;
            }
            System.out.println("Luas bangun " + jenisBangun + " adalah " + luas);
        }else
        {
            System.out.print("Bentuk bangun apa ? (a) Kubus atau (b) Tabung?");     
            submenu1 = sc.next().charAt(0);
            if(submenu1=='a'){
                jenisBangun = "Kubus";
                System.out.println("Inputkan sisi: ");
                sisi = sc.nextInt();
                volume = sisi * sisi;
            }else{
                jenisBangun = "Tabung";
                System.out.println("Inputkan jari jari: ");
                jari = sc.nextInt();
                System.out.println("Inputkan tinggi: ");
                tinggi2 = sc.nextInt();
                volume = 3.14 * jari * jari * tinggi2;
            }
            System.out.println("Volume bangun " + jenisBangun + " adalah " + volume);                                                                                   
        }
        System.out.println("Apa anda ingin menghitung kembali  [true/false]?" );
        ulangi = sc.nextBoolean();
    }
       
    }
}