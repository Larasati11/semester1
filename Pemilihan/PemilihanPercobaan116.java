import java.util.Scanner;
public class PemilihanPercobaan116 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int bil;

        System.out.println("Masukkan Sebuah Bilangan: ");
        bil=input.nextInt();
        String output=(bil%2==0)?"Bilangan Genap":"Bilangan Ganjil";
        System.out.println(output);
        /*if(bil%2==0){
            System.out.println("Bilangan Genap");
        }
        else{
            System.out.println("Bilangan Ganjil");
        }*/
    
    }

}
