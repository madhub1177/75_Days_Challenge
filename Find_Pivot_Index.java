public class Find_Pivot_Index {
    public static void main(String[] args) {
    int [] nums={1,7,3,6,5,6};
    int result=pivotIndex(nums);
    System.out.println(result);
    }

    public static int pivotIndex(int[] nums) {
        
        int leftSum=0;
        int rightSum=0;
        //calculate total sum
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        
        //find pivot index
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        //not finded pivot index so returning -1
        return -1;
    }
}
