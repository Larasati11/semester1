import java.util.Scanner;

public class PercobaanPemilihan216{
    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in);
        String kategori;
        int penghasilan,gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori: ");
        kategori = scan.nextLine();
        System.out.print ("Masukkan besarnya penghasilan: ");
        penghasilan = scan.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 0){
                System.out.println("Penghasilan yang dimasukkan tidak valid");
            }else if (penghasilan <= 2000000){
                pajak = 0.1;
            }else if (penghasilan <= 3000000){
                pajak = 0.15;
            }else {
                pajak = 0.2;
            }
        gajiBersih = (int) (penghasilan-(penghasilan * pajak));
        System.out.println ("Gaji bersih yang anda terima: "+gajiBersih);
        }else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 0){
                System.out.println("Penghasilan yang dimasukkan tidak valid");
            }else if (penghasilan <= 2500000){
                pajak = 0.15;
            }else if (penghasilan <= 3500000){
                pajak = 0.2;
            }else {
                pajak = 0.25;
            }
        gajiBersih = (int) (penghasilan-(penghasilan * pajak));
        System.out.println ("Gaji bersih yang anda terima: "+gajiBersih);
        }else {
            System.out.println("Kategori yang anda masukkan salah");
        }
    }
}