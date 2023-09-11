import java.util.Scanner;

public class ReverseNumber {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.print("Enter a number to Reverse: ");
        int Num = scanner.nextInt();
        scanner.nextLine();

        int Reverse = 0;
        while(Num !=0){
            int Mod = Num%10;
            Reverse = Reverse*10 + Mod;
            Num = Num/10;
        }
        System.out.println(Reverse);
        
        

        
    }
}