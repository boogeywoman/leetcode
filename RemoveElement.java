//https://leetcode.com/problems/remove-element/
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length; 

        for (int i = 0; i < len; ){
             if (nums[i] == val){
                nums [i] = nums [len- 1];
                len--;
             }
             else
             i++;
        } 
        return len;
    }
}