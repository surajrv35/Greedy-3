// Time Complexity : O(N)
// Space Complexity : O(26)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new LinkedList<>();
        
        int[] lastIndex = new int[26];
        for(int i=0;i<S.length();i++)
            lastIndex[S.charAt(i) - 'a'] = i;
        
        int start=0, end=0;
        for(int cursor=0;cursor<S.length();cursor++)
        {
            end=Math.max(end, lastIndex[S.charAt(cursor) - 'a']);
            
            if(cursor == end)
            {
                result.add(end-start+1);
                start=cursor+1;
            }
        }
        return result;
    }
}
