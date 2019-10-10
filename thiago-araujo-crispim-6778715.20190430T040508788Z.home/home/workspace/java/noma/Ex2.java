import java.util.Scanner;
public class Ex2 {
    static Scanner teclado = new Scanner (System.in);
    static int n;
    static int v[][];
    static int media;
    static int max;
    static int min;
    public static void levetor(){
        n = teclado.nextInt();
        v[][] = new int[n][n];
        for(int i=0;i<v.length;i++){
            v[i]=teclado.nextInt();
        }
    }
    public static void media(){
        media = 0;
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v.length;j++){
                media += v[i][j];
            }
        }
        media = media/(n*n);
        System.out.print(media);
        System.out.println();
        
    }
    public static void min(){
        min = v[0][0];
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v.length;j++){
                if (v[i][j]<min)
                    min = v[i][j];
            }
        }
    }
    public static void max(){
        max = v[0][0];
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v.length;j++){
                if (v[i][j]>max)
                    max = v[i][j];
            }
        }
    }
    public static void main (String args[]) {
        levetor();
        media();
        min();
        max();
    }
}