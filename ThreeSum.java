import java.util.*;

public class ThreeSum {
    static List<List<Integer>> result=new ArrayList<>();
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> result=threeSum(nums);
        System.out.println(result);
    }
   
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //duplicate a
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i-1]!=nums[i]){
            twoSumSorted(i+1,nums.length-1,nums,0-nums[i]);
            }
        }
        return result;
    }
    
    public static void twoSumSorted(int i,int j,int[] nums,int target){
        int a1=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                result.add(list);
                
                //dulpicate b
                while(i<j && nums[i]==nums[i+1])i++;
                //duplicate c
                while(i<j && nums[j]==nums[j-1])j--;
                
                i++;
                j--;
            }
        }
    }
}
