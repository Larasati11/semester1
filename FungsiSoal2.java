import java.util.Scanner;
public class FungsiSoal2 {
    int dataMhs[] = new int [7];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai : ");
        int jmlNilai = input.nextInt();
        int nilaiMhs[] = new int [jmlNilai];
        isiannilai(nilaiMhs);
        tampilNilai(nilaiMhs);
        totNilai(nilaiMhs);
    }
    static int []isiannilai(int dataMhs[]){
        for (int j = 0; j < dataMhs.length; j++) {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan nilai ke " + (j+1) + ":");
                dataMhs[j] = input.nextInt();
            };
        
        return dataMhs;
    }
    static void tampilNilai(int dataMhs[]){
            for (int j = 0; j < dataMhs.length; j++) {
                System.out.println("Nilai ke " + (j+1) + ":" + dataMhs[j]);
            };
    }  
    static int []totNilai(int dataMhs[]){
        int total = 0;
            for (int j = 0; j < dataMhs.length; j++) {
                if (dataMhs[j] > total) {
                    total = dataMhs[j];

                    
                }
            }
        System.out.println("Nilai tertinggi " + total);
        return dataMhs;
    }
        
    
}
