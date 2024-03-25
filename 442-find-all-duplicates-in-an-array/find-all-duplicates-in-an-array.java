class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    HashSet<Integer>hs=new HashSet<>();
   ArrayList<Integer>al=new ArrayList<>();
    int l=0;
    for(int i=0;i<nums.length;i++)
    {
        if(!hs.add(nums[i]))
        {
           al.add(nums[i]);
        }
    }
    return al;
    }   
    }