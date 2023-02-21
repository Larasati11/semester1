import java.util.Scanner;
public class Kuis3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  jamKuliah, menitKuliah, detikKuliah, sisaWaktu;
        int jamSekarang =3;
        int menitSekarang =0;
        int detikSekarang =0;
        
        System.out.println("Jam sekarang adalah: " +jamSekarang+ ":" +menitSekarang+ ":" +detikSekarang);
       
        System.out.print("Masukkan jam kuliah: ");
        jamKuliah = sc.nextInt();
        System.out.print("Masukkan menit kuliah: ");
        menitKuliah = sc.nextInt();
        System.out.print("Masukkan detik kuliah: ");
        detikKuliah = sc.nextInt();
        System.out.println("Kuliah anda dimulai : " +jamKuliah+ ":" +menitKuliah+ ":" +detikKuliah);
        sisaWaktu = jamKuliah - jamSekarang;
        System.out.println("Jadi sisa waktu menuju perkuliahan anda adalah : " +sisaWaktu+ "jam " +menitKuliah+ "menit " +detikKuliah+ "detik ");
 
       

    }
}
