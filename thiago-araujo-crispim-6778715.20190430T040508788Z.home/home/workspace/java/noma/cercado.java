// Importa biblioteca
import java.util.Scanner;
    public class cercado {
    public static void main(String args[]) {
     // Leitura de dados pelo teclado
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos metros de cerca?");
        double M = teclado.nextInt();
        System.out.println("Qual o comprimento do terreno?");
        double C = teclado.nextInt();
        System.out.println("Qual a largura do terreno?");
        double L = teclado.nextInt();
        double perimetro = 2*C + 2*L;
        
        if (perimetro <= M)
            System.out.println("Suficiente");
        else 
            System.out.println("Insuficiente");
 }
}