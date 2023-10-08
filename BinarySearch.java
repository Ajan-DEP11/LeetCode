import java.util.Scanner;

public class BinarySearch {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] num = {-3,4,6,12,18,25,45};
        loop:
        do{
            System.out.print("Enter a number to search: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            int start=0;
            int end = num.length -1;
            

            while(start <= end){
                if(start >= end)break;

                int middle = (start+end)/2;

                if(num[middle]==search){
                    System.out.println("search found at: "+ middle);
                    continue loop;
                }else if(search > num[middle]){
                    start = middle +1;
                }else{
                    end = middle -1;
                }

            }
            System.out.println("Search not found");


        }while(true);
        
    }
}
