import java.util.Scanner;
public class Tugas3Perulangan216 {
   public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai N = ");
    int n = sc.nextInt();
    if(n<3){
        System.out.println("N yang anda masukkan minimal 3");
    }
    for(int i=1; i<=n;i++){
        for (int j = 1; j <= n; j++) {
            if((i==1)||(i==n)||(j==1)||(j==n)){
                System.out.print(n);
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
   }


    

