// Importa biblioteca
import java.util.Scanner;
    public class ordemc {
    public static void main(String args[]) {
     // Leitura de dados pelo teclado
         Scanner teclado = new Scanner(System.in);
        
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int z = teclado.nextInt();
        if (x <= y && z <= x)
            System.out.println(z+" "+x+" "+y);
        else if (x <= y && y <= z)
            System.out.println(x+" "+y+" "+z);
        else if (z <= y && y <= x)
            System.out.println(z+" "+y+" "+x);
        else if (y <= z && z <= x)
            System.out.println(y+" "+z+" "+x);
        else if (y <= x && x <= z)
            System.out.println(y+" "+x+" "+z);
        else
            System.out.println(x+" "+z+" "+y);
 }
}