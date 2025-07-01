class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j;
        int len=nums.length;

        if(len==0){
            return 0;
        }
        for(j=1;j<len;j++){
            while(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }return i+1;
    }
}
