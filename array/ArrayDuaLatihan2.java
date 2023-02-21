import java.util.Scanner;
public class ArrayDuaLatihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cabang[] = { "Dieng", "Soehat", "Sengkaling"};
        int data[][] = new int[3][4];
        int total = 0, harga1=0, harga2=0, harga3=0, harga4=0, totalHarga=0;

        for (int i = 0; i < data.length; i++) {
            System.out.println("Cabang : " + cabang[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                    System.out.print("Masukkan jumlah novel: ");
                    data[i][j] = sc.nextInt();
                    harga1 =  data[i][j] * 40000;
                        break;
                    case 1:
                    System.out.print("Masukkan jumlah komik: ");
                    data[i][j] = sc.nextInt();
                    harga2 =  data[i][j] * 28000;
                        break;
                    case 2:
                    System.out.print("Masukkan jumlah buku pelajaran: ");
                    data[i][j] = sc.nextInt();
                    harga3 = data[i][j] * 60000;
                        break;
                    case 3:
                    System.out.print("Masukkan jumlah ensiklopedia: ");
                    data[i][j] = sc.nextInt();
                    harga4 = data[i][j] * 75000;
                        break;
                }
                total += data[i][j];
                totalHarga = harga1 + harga2 + harga3 + harga4;
            }
            System.out.println("Total Buku Terjual : " + total);
            total = 0;
            System.out.println("Total Pemasukan : " + totalHarga);
            totalHarga = 0;
        }
        int[] penjualanTogamas = new int[3];
        int max = penjualanTogamas[0];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Pemasukan Cabang : " + cabang[i]);
            penjualanTogamas[i] = sc.nextInt();
            if (penjualanTogamas[i] > max) {
                max = penjualanTogamas[i];
            }
        }
        System.out.println("Penjualan terbesar Togamas terdapat di cabang " + 
        cabang + " dengan total pendapatan " + max);

    }
}
