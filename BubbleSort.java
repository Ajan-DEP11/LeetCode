import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 3, 1, 7, -5, 0, 2, 2, 6, 4};

        int temp;

        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
           
        }
         System.out.println(Arrays.toString(nums));
        
    }
}
