import java.util.Scanner;
public class U4E3 {
    
    public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
        int n = s.nextInt();
        int a = 1;
        int i;
        
        for(i = 1; i<n; ++i){
            System.out.print(i+" ");
            System.out.println(n-i);
        }
        
    }
}