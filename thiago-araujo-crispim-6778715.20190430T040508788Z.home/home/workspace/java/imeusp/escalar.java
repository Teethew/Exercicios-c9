import java.util.Scanner;
public class escalar {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        for(int i=0;i<n;i++){
            x[i] = teclado.nextDouble();
        }
        
        for(int i=0;i<n;i++){
            y[i] = teclado.nextDouble();
        }
        
        double escalar = 0;
        for(int i=0;i<x.length;i++){
            escalar += (x[i]*y[i]);
        }
        System.out.println(escalar);
        
    }
}