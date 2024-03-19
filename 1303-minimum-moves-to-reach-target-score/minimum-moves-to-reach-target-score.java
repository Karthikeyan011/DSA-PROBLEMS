class Solution {
    public int minMoves(int target, int maxDoubles) {
        int c=0;
        while(maxDoubles>0 && target>1)
        {
            if(target%2==0)
            {
                target=target/2;
                c++;
                maxDoubles--;
            }
            else
            {
                target--;
                c++;
            }
        }
        return c-1+target;
    }
}