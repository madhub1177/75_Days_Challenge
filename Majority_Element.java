public class Majority_Element {
    public static void main(String[] args) {
    int [] nums={3,2,3};
    int result=majorityElement(nums);
    System.out.println(result);
    }
    public static int majorityElement(int[] nums) {
        int length=nums.length;
        int candidate=nums[0];
        int count=1;
        //used Bayer Moore algorithm
        for(int i=1;i<length;i++){
            if(candidate==nums[i]){
                count++;
            }else{
                if(count==0){
                candidate=nums[i];
                count++;    
                }
                count--;
            }
        }
    return candidate;
    }
}
