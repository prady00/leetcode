class Solution {
    
    // solution in quadratic time
    /*public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j] == target && i != j){
                    return new int[]{i,j}; 
                }
            }
        }
        return null;
    }*/
    
    // solution in linear time (two passes)
    // check if complement (target - nums[i]) exists in the HashTable, 
    // if yes, return the {i, target - nums[i]'s value}
    /*    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        
        return null;
    }
    */
    
    // solution in linear time (one passes with lookup back in Hash table for complement)
    // check if complement (target - nums[i]) exists in the HashTable when we are building it 
    // if yes, return the {i, target - nums[i]'s value}
        
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i], i);
        }
        
        return null;
    }
}
