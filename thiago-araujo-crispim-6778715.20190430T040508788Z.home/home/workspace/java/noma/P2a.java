import java.util.Scanner;
public class P2a {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int n[] = new int[1000];
        int k = 0;
        
        while(true) {
            k = teclado.nextInt();
            if(k!=-1)
                n[k] += 1;
            else
                break;
            
            
        }
        
        for(int i=0;i<n.length;i++){
            if (n[i]>0){
                System.out.print(i+":"+n[i]);
                System.out.println();
            }
        }
        System.out.println();
    }
}