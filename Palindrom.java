import java.util.Scanner;

public class Palindrom {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number to Find the Parindrom:");
        int Num = scanner.nextInt();
        scanner.nextLine();

        int temp  = Num;

        int Reverse1 = 0;
        while(Num!= 0){
            int Mod = Num % 10;
            Reverse1 = Reverse1*10 +Mod;
            Num = Num/10;
        }
        if(temp == Reverse1){
            System.out.printf("%d is a Parlindrom Number..\n",temp);
        }else {
            System.out.printf("%d is not a ParlinDrome Number\n",temp);
        }

        
    }
}
