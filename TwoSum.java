import java.util.Arrays;
import java.util.HashMap;

/**
 * Two sum
 */
public class TwoSum {
public static void main(String[] args) {
    int [] nums={2,7,11,15};
    int target=9;
    int result[]=twoSum(nums,target);
    System.out.println(Arrays.toString(result));
}

public static int[] twoSum(int[] nums, int target) {   
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int difference=target-nums[i];
        if(map.containsKey(difference)){
            int num=map.get(difference);
          return new int[]{i,num};
        }else{
            map.put(nums[i],i);
        }
    }
    return new int[]{};
}

    
}