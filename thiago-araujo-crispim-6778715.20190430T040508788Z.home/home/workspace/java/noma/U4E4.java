import java.util.Scanner;
public class U4E4 {
    
    public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
        //int n = s.nextInt();
        //int a = 1;
        int i;
        int avit = 0;
        int bvit = 0;
        
        while(avit<3 && bvit<3){
            System.out.println("Alice, digite seu numero");
            int a = s.nextInt();
            System.out.println("Bob, digite seu numero");
            int b = s.nextInt();
            if ((a+b)%2 == 0){
               avit++;
               System.out.println("Alice venceu a rodada.");
            }
            
            else{
                bvit++;
                System.out.println("Bob venceu a rodada.");
            }
            
        }
        
        if (avit ==3)
            System.out.println("Alice venceu!");
        if (bvit ==3)
            System.out.println("Bob venceu!");
        
    }
}