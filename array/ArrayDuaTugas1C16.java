public class ArrayDuaTugas1C16 {
    public static void main (String [] args) {
        char[] karakter = {'l', 'a', 'r', 'a', 's', 'a', 't', 'i', 'p', 'u', 's', 
        'p', 'i', 't', 'a', 'c', 'a', 'n', 'd', 'r', 'a', 'd', 'e', 'w', 'i' };
        char namaku[][] = new char[8][5];
        int index = 0;

        System.out.println("Array 1 Dimensi");
        for (int i = 0; i < karakter.length; i++) {
            System.out.print(karakter[i]);
        }
       System.out.println("");
       System.out.println("Array 2 Dimensi");
        for (int i = 0; i < namaku.length; i++) {
            for (int j = 0; j < namaku[0].length; j++) {
                namaku[i][j]=karakter[index];
                index++;
                if(index==karakter.length){
                    index=0;
                }
            } 
        }
        for(char array[] : namaku){
            for (char ar : array){
                System.out.printf("%s ", ar);
            }
            System.out.println("");
        } 
    }
}
