import java.util.Scanner;
public class UtskuSoal2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int menu, nik, jmlAnak, totalGaji, gajiPokok = 3000000, tunjAnak = 150000;
        String nama, posisi;
        boolean ulangi = true;

        while(ulangi==true){
        System.out.println("Pilih menu yang anda inginkan (1) biodata (2)total gaji (3) cetak total");
        menu = scan.nextInt();
        if (menu == 1){
            System.out.println("Masukkan nama :" );
            nama = scan.next();
            System.out.println("Masukkan nik :" );
            nik = scan.nextInt();
            System.out.println("Masukkan posisi :" );
            posisi = scan.next();
            System.out.println("Masukkan jumlah Anak :" );
            jmlAnak = scan.nextInt();
         }else if(menu == 2){
            System.out.println("Masukkan jumlah Anak :" );
            jmlAnak = scan.nextInt();
            totalGaji = gajiPokok + (jmlAnak * tunjAnak);
            System.out.println("Total Gaji anda adalah : " + totalGaji);
         }else if(menu == 3){
            System.out.println("Masukkan nama :" );
            nama = scan.next();
            System.out.println("Masukkan nik :" );
            nik = scan.nextInt();
            System.out.println("Masukkan posisi :" );
            posisi = scan.next();
            System.out.println("Masukkan jumlah Anak :" );
            jmlAnak = scan.nextInt();
            totalGaji = gajiPokok + (jmlAnak * tunjAnak);
            System.out.println("======Struk Gaji=====");
            System.out.println("nama : " + nama);
            System.out.println("nik : " + nik);
            System.out.println("posisi : " + posisi);
            System.out.println("jumlah anak : " + jmlAnak);
            System.out.println("Tunjangan anak : " + (jmlAnak * tunjAnak) );
            System.out.println("Total Gaji = " + totalGaji);
         }else{
            System.out.println("Tidak ada menu lain");
         }
         
         System.out.println("Apa anda ingin memilih menu lain ?   [true/false]?" );
         ulangi = scan.nextBoolean();
        }
    }
    
}
