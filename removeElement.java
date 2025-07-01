class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, j;
        int len=nums.length;
        for(j=0;j<len;j++){
           if(nums[j]!=val){
              nums[i]=nums[j];
              i++;
           }
        }return i;
    }
}
