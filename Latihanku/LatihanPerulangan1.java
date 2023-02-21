import java.util.Scanner;
public class LatihanPerulangan1 {
    public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int rangeBil, total = 0, counter = 0;
    double rata = 0;

    System.out.println("Menghitung Jumlah Bilangan Genap dari N Bilangan");
    System.out.print("Masukkan range bilangan : ");
    rangeBil = scan.nextInt();

    for (int i = 1; i<=rangeBil; i++) {
        if (i % 2 == 0) {
            total += i;
            counter++;
            System.out.println("bilangan genap ke " + (i/2) + " = " + i);
             
            
            
        }

    }
    rata = (double) total /counter;
    System.out.printf("Banyaknya bilangan dari 1 sampai %d adalah %d\n", rangeBil, counter);
    System.out.printf("Total bilangan genap dari 1 sampai %d adalah %d\n", rangeBil, total);
    System.out.printf("Rata rata bilangan genap dari 1 sampai %s adalah %s\n", rangeBil, rata);
   
    }
}
