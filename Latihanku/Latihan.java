public class Latihan {
    public static void main (String [] args){
        double kecepatan = 60 ;
        double waktu = 1.5;
        double jarak;

        System.out.println("Diketahui kecepatan = " + kecepatan + "km/jam");
        System.out.println("Diketahui waktu = " + waktu + "jam");
        
        kecepatan = 60 * 1000;
        System.out.println("Mengubah kecepatan dalam meter / jam = " + kecepatan);

        jarak = waktu * kecepatan;
        System.out.println("Jadi jarak yang ditempuh adalah " + jarak);
    
    }
    
}
