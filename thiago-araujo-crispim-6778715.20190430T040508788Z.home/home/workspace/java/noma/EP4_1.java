// Importa biblioteca
import java.util.Scanner;
public class EP4_1 {
    public static void main(String args[]) {
    // Leitura de dados pelo teclado
    Scanner s = new Scanner(System.in);
    
    int m;
    
    //while(1>0) {
    
        //System.out.println("Digite um inteiro positivo n>0");
        int n = s.nextInt();
        if (n<=0)
            System.out.println("Esse numero nao eh valido!");
        else {
            //System.out.print("Os "+n+" multiplos de 3 sao");
            for (int i = 1; i<=n; ++i){
                m = 3*i;
                System.out.print(" "+m+",");
            }
        }
    
        //System.out.println(" ");
    }
    }
//}