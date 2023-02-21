import java.util.Scanner;
public class ArrayTugas316 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan isi array : " );
        int isi= sc.nextInt();
        int[] array = new int[isi];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+":");
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Bilangan terbesar : " + max);
    }
    
}
