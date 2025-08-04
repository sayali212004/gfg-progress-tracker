class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int rows=mat.length;
        int cols=mat[0].length;
        
        Queue <int []> queue = new LinkedList<>();
        int fresh=0;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if (mat[i][j]==2)
                {
                    queue.offer(new int [] {i,j});
                }
                else if(mat[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        
        int time =0;
        int directions[][]={{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!queue.isEmpty() && fresh>0)
        {
            int size = queue.size();
            time++;
            
            for(int i=0;i<size;i++)
            {
                int [] curr= queue.poll();
                
                    for (int[] dir : directions) 
                    {
                            int x = curr[0] + dir[0];
                            int y = curr[1] + dir[1];
                            
                            if(x>=0 && x<rows && y>=0 && y<cols && mat[x][y]==1)
                            {
                                mat[x][y]=2;
                                fresh--;
                                queue.offer(new int [] {x,y});
                            }
                    }
            }
        
            
        }
        return (fresh==0)? time: -1;
    }
}