import java.util.Scanner;
public class ex2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
  /*2.  Deseja-se publicar o número de acertos de cada aluno em uma prova em forma de testes. 
    A prova consta de 30 questões, cada uma com cinco alternativas identificadas por A, B, C, D e E. 
    Para isso são dados:

    o cartão gabarito;
    o número de alunos da turma;
    o cartão de respostas para cada aluno, contendo o seu número e suas respostas.*/

        char v[] = new char[30];
        char u[] = new char[30];
        int acertos = 0;
        for (int i = 0; i < 30; i++) {
            System.out.println("Resposta "+(i+1));
            v[i] = teclado.next().charAt(0);
        }
        for(int i=0; i<30;i++){
            System.out.println("Questao "+(i+1));
            u[i] = teclado.next().charAt(0);
            if (u[i] == v[i])
            acertos = acertos + 1;
        }
        System.out.println("acertos = "+acertos);
        /*for (int i = 0; i < 30; i++) {
            System.out.print(v[i]+" ");
        }*/
    
        
    }        
}

 
