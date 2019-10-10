import java.util.Scanner;
public class pip {
    static Scanner teclado = new Scanner (System.in);
    static int vl;
    static int v[];
    static int ocorrencia;
    public static void levetor(){
        vl = teclado.nextInt();
        v = new int [vl];
        for(int i=0;i<v.length;i++){
            v[i]=teclado.nextInt();
        }
        ocorrencia = 0;
    }
    public static void printpar(){
        for(int i=0;i<v.length;i++){
            if ((v[i]%2)==0)
                System.out.print(v[i]+" ");
        }
    
        System.out.println();
    }
    
    public static void printinpar(){
        for(int i=0;i<v.length;i++){
            if ((v[i]%2)!=0)
                System.out.print(v[i]+" ");
        }
    
        System.out.println();
    }
    
    public static void printprimo(){
        for(int i=0;i<v.length;i++){
            for(int j=1;j<v[i]/2;j++){
                if (v[i]%j!=0)
                    ocorrencia++;
                
            }
            if (ocorrencia>2)
                    System.out.print(v[i]+" ");
            
            ocorrencia=0;
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        levetor();
        printpar();
        printinpar();
        printprimo();
    }
}