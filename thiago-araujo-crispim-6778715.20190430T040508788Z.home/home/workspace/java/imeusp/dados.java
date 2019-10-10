import java.util.Scanner;
public class dados {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
/*Tentando descobrir se um dado era viciado, um dono de cassino honesto (ha! ha! ha! ha!) o lançou n vezes. 
Dados os n resultados dos lançamentos, determinar o número de ocorrências de cada face. */        
        System.out.println("Quando quiser sair, digite 0");
       
        int n[] = new int[6]; int continua = 0;
        while(continua == 0){
            int result = teclado.nextInt();
            switch(result){
                case 1:
                    n[0] += 1;
                    break;
                case 2:
                    n[1] += 1;
                    break;
                case 3:
                    n[2] += 1;
                    break;
                case 4:
                    n[3] += 1;
                    break;
                case 5:
                    n[4] += 1;
                    break;
                case 6:
                    n[5] += 1;
                    break;
            }
            if (result==0){
                continua = 1;
            }
        }
        for(int i=1;i<=n.length;i++)
        System.out.println(i+" = "+n[i-1]);
    }
}