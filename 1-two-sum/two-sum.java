class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        int sum;
        int idx1 = -1;
        int idx2 = -1;

        for(int i = 0; i< (nums2.length-1) ; i++){
            sum = 0;

           for(int j=(i+1); j<nums2.length; j++){ 
            sum = nums2[i] + nums2[j];
           
            if( sum == target){
                 for(int k = 0; k< nums.length ; k++){
                    if((idx1 == -1)&&(nums2[i] == nums[k])){idx1 = k; k++;}
                    if((idx2 == -1) &&(nums2[j] == nums[k])){idx2 = k; }
                 }
                return new int[]{idx1, idx2};
            }
           }
        }
        return null;    
    }
}