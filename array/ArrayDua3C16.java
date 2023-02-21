import java.util.Scanner;
public class ArrayDua3C16 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int data[][] = new int[4][4];
        int jam[] = {3, 6, 9, 12};
        int min[] = {100, 100, 100, 100};
        double total[] = {0, 0, 0, 0};
        double rata[] = {0, 0, 0, 0};
        int maxSuhu = data[0][0];
        int maxKelembaban = data[0][0];
        int maxKecepatan = data[0][0];
        int maxUV = data[0][0];

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Jam %s\n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan suhu: ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (data[i][j]>maxSuhu){
                            maxSuhu= data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 1:
                        System.out.print("Masukkan kelembaban: ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (data[i][j]>maxKelembaban){
                            maxKelembaban= data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 2:
                        System.out.print("Masukkan kecepatan angin: ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (data[i][j]>maxKecepatan){
                            maxKecepatan= data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 3:
                        System.out.print("Masukkan index UV: ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (data[i][j]>maxUV){
                            maxUV= data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                }
                rata[j] = total[j] / data[0].length;
               
            }
        }
        System.out.println("----------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 2; j < 3; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("----------------");
        System.out.printf("Rata-rata suhu: %.2f\n", rata[0]);
        System.out.printf("Presentase kelembaban terendah: %s\n", min[1]);
        System.out.printf("Presentase suhu tertinggi: %s\n", maxSuhu);
        System.out.printf("Presentase kelembaban tertinggi: %s\n", maxKelembaban);
        System.out.printf("Presentase kecepatan angin tertinggi: %s\n", maxKecepatan);
        System.out.printf("Presentase index UV tertinggi: %s\n", maxUV);
        System.out.println("");
        
    }
    
}
