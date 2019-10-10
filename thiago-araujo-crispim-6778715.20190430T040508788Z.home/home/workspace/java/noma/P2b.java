import java.util.Scanner;
public class P2b {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite n e logo apos digite a matriz n*n");
        int n = teclado.nextInt();
        int m[][] = new int[n][n];
        
        //leitura de m
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length ; j++){
                m[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("Digite o numero de itinerarios");
        int b = teclado.nextInt();
        
        int c[][] = new int[b][];
        int p[] = new int[b];
        
        
        //operacao com c
        for(int i=0;i<c.length;i++){
            System.out.println("Digite o tamanho do itinerario");
            p[i] = teclado.nextInt();
            c[i] = new int[p[i]+1];
            System.out.println("Digite o itinerario");
            
             
                for(int j=0;j<p[i]-1;j++){
                    c[i][j] = teclado.nextInt();
                    int k = c[i][j];
                    c[i][p[i]] += m[u][k];
                    u = k;
                }
            
            System.out.println("Custo do itinerario : "+(c[i][p[i]]+1));
        }
        
    }
}