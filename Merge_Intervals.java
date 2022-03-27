import java.io.*;
import java.util.*;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
       int[][] result=merge(intervals);
        System.out.println(result);
    }

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> stack=new Stack<int[]>();
        stack.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){ 
            int startpoint2=intervals[i][0];
             int endpoint2=intervals[i][1];
            
            int[] poparray=stack.pop();
            
            int startpoint1=poparray[0];
             int endpoint1=poparray[1];
            
            int endmax=Math.max(endpoint2,endpoint1);
            
            if(endpoint1>=startpoint2){
                int[] merge=new int[]{startpoint1,endmax};
                stack.add(merge);
            }else{
                stack.add(poparray);
                stack.add(intervals[i]);
                
            }
            
        }
        int[][] output =new int[stack.size()][2];
        for(int i=output.length-1;i>=0;i--){
            int[] poparray=stack.pop();
            output[i][0]=poparray[0];
            output[i][1]=poparray[1];
        }
        return output;
    }
}
