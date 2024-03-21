class Solution {
    int dp[][];
    public int rec(String s1,String s2,int ind1,int ind2)
    {
        if(ind1>=s1.length() || ind2>=s2.length())
        {
            return 0;
        }
        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];
        if(s1.charAt(ind1)==s2.charAt(ind2))
        {
            return dp[ind1][ind2]=1+rec(s1,s2,ind1+1,ind2+1);
        }
        else
        {
           int q1=rec(s1,s2,ind1,ind2+1);
           int q2=rec(s1,s2,ind1+1,ind2);    
           return dp[ind1][ind2]=Math.max(q1,q2);  
        }
    }
    public int longestPalindromeSubseq(String s) {
        dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
       return  rec(s,s1,0,0);
    }
}