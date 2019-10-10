import java.util.Scanner;
public class RvsArray2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        char A[] = new char[10];
        for (int i = 0; i < 10; i++) {
            A[i] = teclado.next().charAt(0);
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(" "+A[i]);
        }


        
    }
}