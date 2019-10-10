import java.util.Scanner;
public class U4E1 {
    
    public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
        int n = s.nextInt();
        int a = 0;
        int i;
        
        for(i = 1; i<=n; ++i){
            a = a + (i*i);
            if(i==n)
            System.out.println(a);
        }
        
    }
}
