import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    Scanner s = new Scanner(System.in); 
        System.out.println("Digite o total de votos para candidato 1");
        int cand1 = s.nextInt();
        System.out.println("Digite o total de votos para candidato 2");
        int cand2 = s.nextInt();
        System.out.println("Digite o total de votos nulos");
        int nulos = s.nextInt();
        System.out.println("Digite o total de votos em branco");
        int branco = s.nextInt();
        
        int tvotos = cand1+cand2+nulos+branco;
        
        double pcand2 = (cand2/tvotos)*100;
        double pcand1 = (cand1/tvotos)*100;
        System.out.println(pcand1);
        System.out.println(pcand2);
        
        
        
        
        //System.out.println("O candidato 1 teve "+pcand1+"% dos votos");
        //System.out.println("O total de votos eh"+tvotos);
    }
}