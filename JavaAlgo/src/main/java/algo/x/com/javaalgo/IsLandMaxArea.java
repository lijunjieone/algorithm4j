package algo.x.com.javaalgo;

public class IsLandMaxArea {

    public static void main(String[] args) {

        int[][] islands = new int[][]{{0,0,0,1,1,0,1,0}};
        int max=new Solution().maxAreaOfIsland(islands);
        System.out.println("area:"+max);

    }

}

/**
 * 1.遍历
 * 2.查找每个节点的上下左右
 * 3.一旦查过就将节点设置为0
 */

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {

                int c = getArea(i,j,grid);
                if(c>max) {
                    max=c;
                }


            }
        }


        return max;

    }



    public int getArea(int i,int j,int[][] grid) {

        int count = 0;
        if(grid[i][j]==0) {
            return 0;
        }


        if(grid[i][j]==1) {
            // al.add(key);
            grid[i][j]=0;
            count = 1;

        }

        if(i-1>=0) {
            int left = getArea(i-1,j,grid);
            count+=left;
        }

        if(j-1>=0) {
            int left = getArea(i,j-1,grid);
            count+=left;

        }
        if(i+1<grid.length) {
            int right = getArea(i+1,j,grid);

            count+=right;

        }

        if(j+1<grid[0].length) {
            int bottom = getArea(i,j+1,grid);

            count+=bottom;

        }

        return count;
    }


}