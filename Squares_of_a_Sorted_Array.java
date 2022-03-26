import java.util.Arrays;

public class Squares_of_a_Sorted_Array {

    public static void main(String[] args) {
    int [] nums={-4,-1,0,3,10};
    int result[]=sortedSquares(nums);
    System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        int len=nums.length-1;
        int i=0,j=len;
        while(i<=j){
            result [len--]=Math.max(nums[i]*nums[i],nums[j]*nums[j]);
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                i++;
            }else{
                j--;
            }
        }
        return result;
    }
}
