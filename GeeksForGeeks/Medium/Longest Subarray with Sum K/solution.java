import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer,Integer>map = new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                maxLen = i+1;
                
            }
                        int remaining = sum - k;
            if (map.containsKey(remaining)) {
                maxLen = Math.max(maxLen, i - map.get(remaining));
            }

            // Store first occurrence of the prefix sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    

            
        }
}
