public class praktikum_fungsi {
    public static void main(String[] args) {
        int [][] royalGarden = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        String cabang []= {"Royal Garden1", "Royal Garden2", "Royal Garden3", "RoyalGarden4"};
        int harga[]= {75000, 50000, 60000, 10000};
        tampilStok(royalGarden, harga, cabang);
        
    }
    static void tampilStok(int[][]royalGarden, int harga[], String cabang[] ){
        System.out.println("======================================================================");
        System.out.println("\t\t\t" + "Stok Bunga Royal Garden");
        System.out.println("======================================================================");
        System.out.print("Cabang" + "\t\t\t" + "Aglonema" + "\t\t" + "Keladi" + "\t\t" + "Alocasia" + "\t\t\t" + "Mawar" );
        System.out.println();
        for (int i = 0; i < royalGarden.length; i++) {
            System.out.println(cabang[i] + "\t\t");
            for (int j = 0; j < royalGarden[0].length; j++) {
                System.out.print("\t\t\t" + royalGarden[i][j]);
            }
            ;
            System.out.println();
        }
    }
}
