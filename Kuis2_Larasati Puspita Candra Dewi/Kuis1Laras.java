import java.util.Scanner;
public class Kuis1Laras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double data[][] = new double [6][6];
        String kelas[] = {"1Z" ,"1G"};
        String dataMahasiswa1 []= {"Rina", "Mia", "Ronny", "Fajri", "Risa", "Fatih"};
        String dataMahasiswa2 []= {"Bima", "Sari", "Dina", "Ari", "Cika", "Beni"};
        double nilaiAkhir1[] = {80, 90, 100, 75, 85, 90};
        double nilaiAkhir2[] = {80, 90, 100, 75, 85, 90};
        double nilaiAkhirAll[] = {80, 90, 100, 75, 85, 90, 80, 90, 100, 75, 85, 90};
        double totalTugas = 0, totalKuis1=0, totalKuis2=0, totalUAS=0, totalUTS=0, rata2 =  0;

        for (int outer = 0; outer < data.length; outer++) {
            System.out.println("Kelas : " + kelas[outer]);
            for (int i = 0; i < data.length; i++) {
            if (outer == 0) {
                System.out.println("Nama Mahasiwa : " + dataMahasiswa1[i]);
            } else {
                System.out.println("Nama Mahasiwa : " + dataMahasiswa2[i]);
            }
            for (int j = 0; j < data.length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Nilai Tugas: ");
                        data[i][j] = sc.nextInt();
                        totalTugas =  data[i][j];
                        break;
                    case 1:
                        System.out.print("Nilai Kuis1: ");
                        data[i][j] = sc.nextInt();
                        totalKuis1 = data[i][j] ;
                        break;
                    case 2:
                        System.out.print("Nilai Kuis2: ");
                        data[i][j] = sc.nextInt();
                        totalKuis2 = data[i][j] ;
                        break;
                    case 3:
                        System.out.print("Nilai UTS: ");
                        data[i][j] = sc.nextInt();
                        totalUTS =  data[i][j] ;
                        break;
                    case 4:
                        System.out.print("Nilai UAS: ");
                        data[i][j] = sc.nextInt();
                        totalUAS =  data[i][j] ;
                        break;
                }

               rata2 = (totalTugas + totalKuis1 + totalKuis2+ totalUTS + totalUAS)/5;
            }
            System.out.println("Nilai akhir adalah : " + rata2);
            
            }
        }
                  
            double maxZ = nilaiAkhir1[0];
            for (int i = 0; i < nilaiAkhir1.length; i++) {
                if (nilaiAkhir1[i] > maxZ) {
                maxZ= nilaiAkhir1[i];
                } 
            }
            System.out.println("Nilai tertinggi kelas 1Z :" + maxZ);
            double maxG = nilaiAkhir2[0];
            for (int i = 0; i < nilaiAkhir2.length; i++) {
                if (nilaiAkhir2[i] > maxG) {
                maxG = nilaiAkhir2[i];
                } 
            }
            System.out.println("Nilai tertinggi kelas 1G :" + maxG);

            double minZ = nilaiAkhir1[0];
            for (int i = 0; i < nilaiAkhir1.length; i++) {
                if (nilaiAkhir1[i] < minZ) {
                    minZ = nilaiAkhir1[i];
                    } 
            }
            System.out.println("Nilai terendah kelas 1Z :" + minZ);

            double minG = nilaiAkhir2[0];
            for (int i = 0; i < nilaiAkhir2.length; i++) {
                if (nilaiAkhir2[i] < minG) {
                    minG = nilaiAkhir2[i];
                    } 
            }
            System.out.println("Nilai terendah kelas 1G :" + minG);

            double maxAll = nilaiAkhirAll[0];
            for (int i = 0; i < nilaiAkhirAll.length; i++) {
                if (nilaiAkhirAll[i] > maxAll) {
                maxAll = nilaiAkhirAll[i];
                } 
            }
            System.out.println("Nilai tertinggi dari semua kelas :" + maxAll);
            double minAll = nilaiAkhirAll[0];
            for (int i = 0; i < nilaiAkhirAll.length; i++) {
                if (nilaiAkhirAll[i] < minAll) {
                minAll = nilaiAkhirAll[i];
                } 
            }
            System.out.println("Nilai terendah dari semua kelas :" + minAll);

    }
}
