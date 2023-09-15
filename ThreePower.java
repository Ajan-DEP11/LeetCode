import java.util.Scanner;

public class ThreePower {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     do  { 
        System.out.print("Enter a number to check: ");
        int Num = scanner.nextInt();
        scanner.nextLine();

        while (Num >0){
            loop:
            Num = Num/3;
            if(Num%3 ==0){
                continue;
            }
        }
      System.out.println("true");
        
        
        }while(true);
    }

}
