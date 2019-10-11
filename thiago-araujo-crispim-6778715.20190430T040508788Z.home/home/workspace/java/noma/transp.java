import java.util.Scanner;
public class transp {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        //Programa para transpor matrizes
        
        int n = teclado.nextInt();
        int I[][] = new int[n][n];
        int J[][] = new int[n][m];
        
        //leitura
        for (int i = 0; i < I.length; i++){
            for (int j = 0; j < I.length ; j++){
                I[i][j] = teclado.nextInt();
            }
        }
        
        //operaçao
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                J[i][j] = I[j][i];
                System.out.print(J[i][j]+" ");
            }
        }
        
       
        //impressao
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(J[i][j]+" ");
            }
            System.out.println();
        }*/
        
        //System.out.print(J[3][2]);
        
    }
}
