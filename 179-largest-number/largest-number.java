class Solution {
    Comparator<String>cmp=new Comparator<>()
    {
        public int compare(String a,String b)
        {
            String s1=a+b;
            String s2=b+a;
            return s2.compareTo(s1);
        }
    };
    public String largestNumber(int[] nums) {
       String s[]=new String[nums.length];
       for(int i=0;i<nums.length;i++)
       {
        s[i]=nums[i]+"";
       } 
       Arrays.sort(s,cmp);
       if(s[0].equals("0"))
       return "0";
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length;i++)
       {
       sb.append(s[i]);
       }
       return sb.toString();
    }
}