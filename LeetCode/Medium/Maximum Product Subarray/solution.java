class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
      
        // Initializing result
        int maxProd = nums[0];

        for (int i = 0; i < n; i++) {
            int mul = 1;
          
            // traversing in current subarray
            for (int j = i; j < n; j++) {
                mul *= nums[j];
              
                // updating result every time
                // to keep track of the maximum product
                maxProd = Math.max(maxProd, mul);
            }
        }
        return maxProd;
        
    }
}