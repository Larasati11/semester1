import java.util.Scanner;
public class Fungsi1Tugas215 {
    int dataMhs[][] = new int [5][7];
    //fungsi menginputkan nilai
    static int [][] isiannilai(int dataMhs[][]){
        Scanner input = new Scanner(System.in);
        String namaMhs[] = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        for (int i = 0; i < dataMhs.length; i++) {
            System.out.println(namaMhs[i]);
            for (int j = 0; j < dataMhs[0].length; j++) {
                System.out.print("Masukkan nilai minggu ke " + (j+1) + ":");
                dataMhs[i][j] = input.nextInt();
            };
        }
        return dataMhs;
        
    }
    //fungsi untuk menampilkan nilai
    static void tampilNilai(int dataMhs[][]){
        String namaMhs[] = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        for (int i = 0; i < dataMhs.length; i++) {
            System.out.println(namaMhs[i]);
            for (int j = 0; j < dataMhs[0].length; j++) {
                System.out.println("Nilai minggu ke " + (j+1) + ":" + dataMhs[i][j]);
                
            };
        }  
        
    }
    //fugsi untuk mencari nilai tertinggi pada minggu keberapa 
    static int [][]maxMinggu(int dataMhs[][]){
        int max = 0;
        int minggu =0;
         for (int i = 0; i < dataMhs.length; i++) {
            for (int j = 0; j < dataMhs[0].length; j++) {
                if (dataMhs[i][j] > max) {
                    max = dataMhs[i][j];
                    if(j > minggu);
                    minggu = (j+1);

                    
                }
            }
        } 
        System.out.println("Nilai tertinggi terdapat pada minggu ke- " + minggu);
        return dataMhs;
    }
    //fungsi untuk mencari nilai tertinggi + minggunya + nama 
    static int [][]maxNilai(int dataMhs[][]){
        int max = 0;
        int minggu =0;
        String nama = "";
        String namaMhs[] = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
         for (int i = 0; i < dataMhs.length; i++) {
            for (int j = 0; j < dataMhs[0].length; j++) {
                if (dataMhs[i][j] > max) {
                    max = dataMhs[i][j];
                    nama = namaMhs[i];
                    if(j > minggu);
                    minggu = (j+1);

                    
                }
            }
        } 
        System.out.println("Nilai tertinggi " + max + " diraih oleh " + nama + " pada minggu ke " + minggu);
        return dataMhs;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = input.nextInt();
        System.out.print("Masukkan jumlah nilai : ");
        int jmlNilai = input.nextInt();
        
        int nilaiMhs[][] = new int [jmlMhs][jmlNilai];
        isiannilai(nilaiMhs);
        tampilNilai(nilaiMhs);
        maxMinggu(nilaiMhs);
        maxNilai(nilaiMhs);   
    }
}
