import java.util.Scanner;

public class Palindrom {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number to Find the Parindrom:");
        int Num = scanner.nextInt();
        scanner.nextLine();

        int temp  = Num;

        int Reverse = 0;
        while(Num!= 0){
            int Mod = Num % 10;
            Reverse = Reverse*10 +Mod;
            Num = Num/10;
        }
        if(temp == Reverse){
            System.out.printf("% is a Parlindrom Number..",temp);
        }else {
            System.out.printf("% is not a ParlinDrome Number",temp);
        }

        
    }
}
