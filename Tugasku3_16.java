import java.util.Scanner;
public class Tugasku3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suhu, celcius, reamur, fahrenhait, kelvin;
        System.out.println("-----KONVERSI SUHUKU-----");
        System.out.println("Masukkan suhu: ");
        suhu = sc.nextFloat();
        celcius = (suhu);
        System.out.println("Celcius: " +celcius);

        reamur = celcius * 4 / 5;
        System.out.println("Reamur: " + reamur);

        fahrenhait = (celcius * 9 / 5) + 32;
        System.out.println("Fahrenhait: " +fahrenhait);

        kelvin = celcius + 273;
        System.out.println("Kelvin: " +kelvin);
        System.out.println("-----CODING LARAS-----");

    }
}