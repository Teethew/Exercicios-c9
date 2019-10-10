// Importa biblioteca
import java.util.Scanner;
public class Soma2 {
 public static void main(String args[]) {
 // Leitura de dados pelo teclado
 Scanner teclado = new Scanner(System.in);

 int x = teclado.nextInt();
 int y = teclado.nextInt();
 int z = x + y;
 System.out.println("Soma de x+y = " + z);
 }
}