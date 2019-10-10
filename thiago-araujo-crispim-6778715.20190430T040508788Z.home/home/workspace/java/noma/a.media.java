import java.util.Scanner;
public class a.media {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double A[] = new double[10];
        for (int i = 0; i < 10; i++) {
            A[i] = teclado.nextDouble();
        }
        
        double soma = 0;
        
        for(int i=0; i < 10; i++) {
            soma += A[i];
        }
        
        double media = soma/A.length;
        
        System.out.println(media);
        
        for (int i = 0; i < 10; i++) {
            if (A[i] > media)
            System.out.println(A[i]);
        }


        
    }
}
