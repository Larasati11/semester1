public class Tugas2Perulangan116 {
    public static void main(String[] args){
        int tiket, total = 0, i = 0;
        System.out.println("=================================================");
        System.out.println("Harga anak anak " + "\t" + "= 50000");
        System.out.println("Harga dewasa " + "\t\t" + "= 100000");
        System.out.println("Pengunjung per hari " + "\t" + "= 5 anak anak & 5 dewasa");
        while (i<=31){
           
            if(i % 7 != 0){
                tiket = 50000;
                total += tiket * 5;
                tiket = 100000;
                total += tiket * 5;
                System.out.println("Pemasukan selama  " + i + " hari = " + total);

            }else{
                System.out.println("------------LIBUR------------");
            }
             i++;
        }
       
        System.out.print("Hasil Pemasukkan 1 Bulan adalah " + total);


    }
}
