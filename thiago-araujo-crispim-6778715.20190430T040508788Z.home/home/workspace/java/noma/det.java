import java.util.Scanner;
public class det {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int I[][] = new int[3][5];
        
        //leitura
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3 ; j++){
                I[i][j] = teclado.nextInt();
            }
        }
        
        //preparo
        I[0][3] = I[0][0]; I[0][4] = I[0][1];
        I[1][3] = I[1][0]; I[1][4] = I[1][1];
        I[2][3] = I[2][0]; I[2][4] = I[2][1];
        
        
        //calculo
        int det = 0;
        int detD = 0;
        int detC = 0;
        
        for (int i=0; i<I.length;i++){
            //int j = 0;
            detD += (I[0][i]*I[1][i+1]*I[2][i+2]);
            //j++;
        }
        System.out.print("("+detD+") ");
        
        for (int i=0; i<I.length;i++){
            //int j = 0;
            detC += (I[2][i]*I[1][i+1]*I[0][i+2]);
            //j++;
        }
        System.out.print("- ");
        System.out.print("("+detC+") ");
        
        det = detD-detC;
        System.out.println("= "+det);
        
        //impressão
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(I[i][j]+" ");
            }
            System.out.println();
        }   
    }
}