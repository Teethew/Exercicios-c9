import java.util.Scanner;
public class diag {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int I[][] = new int[n][n];
        
        //leitura
        for (int i = 0; i < I.length; i++){
            for (int j = 0; j < I.length ; j++){
                I[i][j] = teclado.nextInt();
            }
        }
        
       
        //impressão
        /*for (int i = 0; i < I.length; i++) {
            for (int j = 0; j < I.length; j++) {
                System.out.print(I[i][j]+" ");
            }
            System.out.println();
        }*/
        int j = 0;
        for(int i=0;i<I.length;i++){
            System.out.print(I[i][j]+" ");
            j++;
        }
        System.out.println();
    }
}