public class Kuis4{
     public static void main(String[] args){
       
        int kecepatan = 70;
        double waktu = 1.25;
        double jarak;
        double kecepatanMeter;
       
        
        kecepatanMeter= 70 * 1000;
        System.out.println("Kecepatan dalam meter : "+ kecepatanMeter);
        jarak = kecepatanMeter* waktu;
        System.out.println("Jadi jarak yang ditempuh adalah : "+ jarak+ " meter per jam");

     }
}