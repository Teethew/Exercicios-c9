import java.util.Scanner;
public class RvsArray {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int A[] = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = teclado.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(A[i]);
        }


        
    }
}
