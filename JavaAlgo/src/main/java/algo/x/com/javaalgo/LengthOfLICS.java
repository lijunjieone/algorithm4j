package algo.x.com.javaalgo;

public class LengthOfLICS {


    /*
     * 1.比较前后数据，后面比前面大加1
     * 2.后面跟前面相同或者小，计数恢复为1
     */
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int count = 1;
        if(nums.length==1) {
            return 1;
        }
        for(int i=1;i<nums.length;i++) {
            int a=nums[i-1];
            int b = nums[i];
            if(a<b) {
                count+=1;
            }else if(a>=b) {
                count = 1;
            }

            if(count>max) {
                max=count;
            }
        }


        return max;

    }
}
