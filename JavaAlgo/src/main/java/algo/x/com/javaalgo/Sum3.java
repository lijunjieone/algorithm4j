package algo.x.com.javaalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sum3 {
    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};


    /**
     * 结果正确，计算超时了。还需要优化
     */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            ArrayList al =new ArrayList();
            ArrayList r = new ArrayList();


            if(nums.length<3) {
                // ArrayList r = new ArrayList();
                // al.add(r);
                return al;
            }
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++) {
                int a = nums[i];
                if(a>0) {
                    break;
                }

                for(int j=i+1;j<nums.length;j++) {
                    int b = nums[j];
                    int c = a+b;



                    if(c>0) {
                        break;
                    }
                    // int index = findIndex(nums,c,j+1);
                    int index = Arrays.binarySearch(nums,j+1,nums.length, -c);
                    // System.out.println("a:"+a+",b"+b+",c:"+c+",index:"+index);
                    if(index >=0) {
                        r = new ArrayList();
                        r.add(a);
                        r.add(b);
                        r.add(nums[index]);
                        // Collections.sort(r);
                        if(!al.contains(r)) {
                            al.add(r);
                        }
                        // break;
                    }
                }
            }

            return al;

        }

        public int findIndex(int[] nums,int target,int startIndex) {
            for(int i=startIndex;i<nums.length;i++) {
                int t = nums[i];
                if(t == -target) {
                    return i;
                }
            }

            return -1;
        }
    }
}


