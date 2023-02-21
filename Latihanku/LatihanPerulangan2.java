import java.util.Scanner;
public class LatihanPerulangan2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            if (i % 2 == 0) {
                continue;
            } else if(i == 3) {
                break;
                
            }
            System.out.print(i + " ");
            
        }
        /*int rangeBil, total = 0, counter = 0, i = 1;
        double rata = 0;

        System.out.print("Masukkan range bilangan : ");
        rangeBil = scan.nextInt();

       while (i <= rangeBil){
        if (i % 2 != 0){    
            System.out.println("Bilangan ganjil " + i);
            total += i * i;
            counter++;
            
        }
        i++;
      
    }
    rata = (double) total /counter;
    System.out.println("Total Bilangan Ganjil " + total); 
    System.out.println("Banyaknya Bilangan Ganjil " + counter);
    System.out.println("Rata rata bilangan ganjil " + rata);
    */
}
}