public class faktorial {
    static int faktorialRekursif(int n){
        if ((n==0)) {
            return(1);
        } else {
            return (n + faktorialRekursif(n-1));
        }
    }
    static int faktorialIteratif(int n){
        int faktor = 1;
        for (int i = n; i > 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
    static int permutasi(int n, int r){
        if(n<r){
            return(0);
        }else{
            return(faktorialRekursif(n)/faktorialRekursif(n-r));
        }
    }
    static int permutasiIteratif(int n, int r){
        int total=1;
        for (int i = 0; i < r; i++) {
            total *= n-i;
        }
        return total;
    }
    static double sahamIteratif(double n){
        double harga = 10000;
        double keuntungan=0;
        for (int i = 0; i < n; i++) {
            keuntungan += harga * 0.055;
        }
        return keuntungan;
    }
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
        System.out.println(permutasi(4, 2));
        System.out.println(permutasiIteratif(4, 2));
        System.out.println(sahamIteratif(20));
    }
}
