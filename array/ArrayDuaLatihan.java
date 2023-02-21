import java.util.Scanner;
public class ArrayDuaLatihan {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int dataSKS[][] = new int[10][10];
        String dataN[][] = new String[10][10];
        int[] arr;
        String namaMK [] = new String[10];
        double dataN1=0, dataN2=0, dataN3=0, dataN4=0, dataN5=0, total = 0;
        
            System.out.println("Masukkan jumlah MK yang anda ambil : ");
            int mk = sc.nextInt();
            arr = new int[mk];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Masukkan nama Mk ke-" + (i+1) + ": ");
                namaMK[i] = sc.next();
            }
            for (int i = 0; i < mk; i++) {
            for (int j = 0; j < mk; j++) {
                switch (j) {
                    case 0:
                    System.out.print("Masukkan bobot sks " + namaMK[i] + ":");
                    dataSKS[i][j] = sc.nextInt();
                    break;
                    case 2:
                    System.out.print("Masukkan nilai " + namaMK[i] + ":");
                    dataN[i][j] = sc.next();
                    if (dataN[i][j].equalsIgnoreCase("A")){
                        dataN1 = 4;
                    }else if(dataN[i][j].equalsIgnoreCase("B+")){
                        dataN2 = 3.5;
                    }else if(dataN[i][j].equalsIgnoreCase("B")){
                        dataN3 = 3;
                    }else if(dataN[i][j].equalsIgnoreCase("C+")){
                        dataN4 = 2.5;
                    }else{
                        dataN5 = 2;
                    }
                        break;
                }
                           
            }
        } 

        total = (dataN1 + dataN2 + dataN3 + dataN4 + dataN5) / mk;
        System.out.println("IP anda adalah : " + total);
        
    }
}
