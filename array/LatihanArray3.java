public class LatihanArray3 {
    public static void main(String [] args) {
        int array[] = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i= array.length; i > 0; i--) {
            
            System.out.print(array[i-1]+ " ");
        }
    }
}
