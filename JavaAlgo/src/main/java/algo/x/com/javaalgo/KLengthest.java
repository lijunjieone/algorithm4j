package algo.x.com.javaalgo;

import java.util.Arrays;

public class KLengthest {



    class Solution {
        public int findKthLargest(int[] nums, int k) {
//            int[] knums=new int[k];

            int count =0;
            int lastKey = 0;
            Arrays.sort(nums);
            for(int i = nums.length-1;i>0;i--) {
                if(i==nums.length-1) {
                    lastKey = nums[i];

                }else if(nums[i]<lastKey) {
                    lastKey = nums[i];
                    count+=1;
                    if(count == k) {
                        return lastKey;
                    }
                }

            }

            return 0;




        }


    }
}
