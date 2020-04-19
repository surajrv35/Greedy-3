// Time Complexity : O(N)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0) return new int[0][0];
        
        Comparator<int[]> customComparator = new Comparator<>() 
        {
            @Override public int compare(int[] a, int[] b)
            {
                if(a[0] == b[0])
                    return a[1]-b[1];
                else
                    return b[0]-a[0];
            }
        };
        
        Arrays.sort(people, customComparator);
        List<int[]> result = new ArrayList<>();
        for(int[] person : people)
            result.add(person[1], person);
        
        return result.toArray(new int[0][2]);
    }
}
