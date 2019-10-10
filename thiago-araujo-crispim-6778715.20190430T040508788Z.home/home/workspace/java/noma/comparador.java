import java.util.Scanner;
public class comparador {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            B[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i])
            System.out.println(A[i]);
            else
            System.out.println(B[i]);
        }


        
    }
}