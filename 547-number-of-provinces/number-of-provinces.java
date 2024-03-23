class Solution {
    boolean visited[];
    public void dfs(int [][]mat,int val)
    {
        visited[val]=true;
          for(int i=0;i<mat.length;i++)
         {
            if(!visited[i])
            {
               if(mat[val][i]==1)
               {
                    dfs(mat,i);
               }
            }
         }
    }
    public int findCircleNum(int[][] mat) {
        int c=0;
        visited=new boolean[mat.length];
      for(int i=0;i<mat.length;i++)
      {
        if(!visited[i])
        {
            c++;
            dfs(mat,i);
        }
      }
      return c;
    }
}