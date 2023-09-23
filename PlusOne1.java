import java.util.Arrays;

public class PlusOne1 {
    public static void main(String[] args) {
        
        int[] num = {1,2,3,9};
        
        for(int i= num.length-1; i>=0;i--){

            if(num[i] < 9){
                num[i]++;
                return;
            }
            num[i] =0;


        }
        num = new int[num.length +1];
        num[0] = 1;
        return;
        
        
    }
}
