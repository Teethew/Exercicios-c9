import java.util.Scanner;
public class ex6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

/*Dados dois strings (um contendo uma frase e outro contendo uma palavra), 
determine o número de vezes que a palavra ocorre na frase.

Exemplo: 
Para a palavra ANA e a frase :
ANA E MARIANA GOSTAM DE BANANA (2)
Temos que a palavra ocorre 4 vezes na frase.*/
        
        String palavra[] = new String[1];      
        String frase[] = new String[6];
        
        System.out.println("Escreva a frase e quando acabar digite");
        for(int i=0;i<6;i++){
            frase[i] = teclado.next();
        }
        //System.out.println("over");
        System.out.println("Escreva a palavra");
        palavra[0]= teclado.next();
        
        /*if(frase[i]=="A")
        {if(frase[i+1]=="N")*/
        
        if (palavra[0] <= frase[2])
            System.out.println("xau");
        
        
        
    }
}