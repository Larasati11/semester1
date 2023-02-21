import java.util.Scanner;
public class ArrayDuaTugas2C16 {
    public static void main(String[] args) {
        int [][] dataTogamas = {
                            {8,9,5,2},
                            {7,5,10,3},
                            {4,6,6,5}
        };
        Scanner sc = new Scanner(System.in);
        int totalDieng, totalSoehat, totalSengkaling;
        totalDieng = dataTogamas[0][0] + dataTogamas[0][1] + dataTogamas[0][2] + dataTogamas[0][3];
        totalSoehat = dataTogamas[1][0] + dataTogamas[1][1] + dataTogamas[1][2] + dataTogamas[1][3];
        totalSengkaling = dataTogamas[2][0] + dataTogamas[2][1] + dataTogamas[2][2] + dataTogamas[2][3];
        System.out.println("Total Buku Terjual Setiap Cabang");
        System.out.println("Cabang Dieng : " + totalDieng);
        System.out.println("Cabang Soehat : " + totalSoehat);
        System.out.println("Cabang Sengkaling : " + totalSengkaling);

        int pemasukanDieng, pemasukanSoehat, pemasukanSengkaling, totalPemasukan;
        pemasukanDieng = (dataTogamas[0][0] * 40000) + (dataTogamas[0][1] * 28000) 
        + (dataTogamas[0][2] * 60000) + (dataTogamas[0][3] * 75000);
        pemasukanSoehat = (dataTogamas[1][0] * 40000) + (dataTogamas[1][1] * 28000) 
        + (dataTogamas[1][2] * 60000) + (dataTogamas[1][3] * 75000);
        pemasukanSengkaling = (dataTogamas[2][0] * 40000) + (dataTogamas[2][1] * 28000) 
        + (dataTogamas[2][2] * 60000) + (dataTogamas[2][3] * 75000);
        System.out.println("Total Penjualan Setiap Cabang");
        System.out.println("Cabang Dieng : " + pemasukanDieng);
        System.out.println("Cabang Soehat : " + pemasukanSoehat);
        System.out.println("Cabang Sengkaling : " + pemasukanSengkaling);
        totalPemasukan = pemasukanDieng + pemasukanSengkaling + pemasukanSoehat;
        System.out.println("Pemasukan Togamas Semua Cabang :" + totalPemasukan);

        int[] penjualanTogamas = new int[3];
        for (int i = 0; i < penjualanTogamas.length; i++) {
            System.out.print("Masukkan pemasukan togamas cabang ke-"+ (i+1) +":");
            penjualanTogamas[i] = sc.nextInt();
        }
        int max = penjualanTogamas[0];
        String cabang = "";
        for (int i = 0; i < penjualanTogamas.length; i++) {
            if (penjualanTogamas[i] > max) {
                max = penjualanTogamas[i];
                if(i==0){
                    cabang = "Dieng";
                }else if (i==1){
                    cabang = "Soehat";
                }else{
                    cabang = "Sengkaling";
                }
            }
        }
        System.out.println("Penjualan terbesar Togamas terdapat di cabang " + 
        cabang + " dengan total pendapatan " + max);
    }
}
