import java.util.Scanner;
public class ArrayTugas216 {
    public static void main(String [] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+":");
            array[i] = sc.nextInt();
        }
        for (int i= array.length; i > 0; i--) {
            
            System.out.print(array[i-1]+ " ");
        }
    }
}
