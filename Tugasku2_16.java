import java.util.Scanner;
public class Tugasku2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----AYO BELANJA-----");
        int itemMerah, itemBiru, hargaItemMerah, hargaItemBiru, totalAkhir, 
        hargaDiskonItemMerah, hargaDiskonItemBiru, jumlahItemMerah, 
        totalItemMerah, jumlahItemBiru, totalItemBiru;
        
        System.out.println("Masukkan jumlah item yang bertanda merah: ");
        itemMerah = sc.nextInt();
        System.out.println("Masukkan harga item yang bertanda merah: ");
        hargaItemMerah = sc.nextInt();

        jumlahItemMerah = itemMerah * hargaItemMerah;
        System.out.println("Jumlah\t\t\t : " +jumlahItemMerah);

        hargaDiskonItemMerah = jumlahItemMerah * 30 / 100;
        System.out.println("Diskon\t\t\t : " +hargaDiskonItemMerah);

        totalItemMerah = jumlahItemMerah - hargaDiskonItemMerah;
        System.out.println("Harga setalah diskon\t : " +totalItemMerah);

        System.out.println("Masukkan jumlah item yang bertanda biru: ");
        itemBiru = sc.nextInt();
        System.out.println("Masukkan harga item yang bertanda biru: ");
        hargaItemBiru = sc.nextInt();

        jumlahItemBiru = itemBiru * hargaItemBiru;
        System.out.println("Jumlah\t\t\t : " +jumlahItemBiru);

        hargaDiskonItemBiru = jumlahItemBiru * 50 / 100;
        System.out.println("Diskon\t\t\t : " +hargaDiskonItemBiru);

        totalItemBiru = jumlahItemBiru - hargaDiskonItemBiru;
        System.out.println("Harga setelah diskon\t : " +totalItemBiru);

        totalAkhir = totalItemBiru + totalItemMerah;
        System.out.println("Total Harga yang harus anda bayarkan : " +totalAkhir);
        System.out.println("-----CODING LARAS-----");

    }
}