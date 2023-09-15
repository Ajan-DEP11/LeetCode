import java.util.Scanner;

public class LinearSearchAlgo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String[] names = {"Kasun", "Nuwan", "Ruwan", "Supun", "Upul", "Nimal","Ruwan", "Supun", "Upul"};

        

     do {  
        System.out.print("Enter a name to Search: ");
        String search = scanner.nextLine();

        for(int i=0; i< names.length;i++){
            if(names[i].equalsIgnoreCase(search)){

                System.out.printf("Found the name %s at %s \n",search,(i+1));

                continue;

            }
        }
        System.out.println("Name not found..");

        }while(true);
        
    }
}
