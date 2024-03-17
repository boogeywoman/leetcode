//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1205805770/
class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {
      int len = nums.length;
      int currentIndex = 1;

      for (int i = 1; i < len; i++) {
          if (nums[i] != nums[i - 1]) {
              nums[currentIndex] = nums[i];
              currentIndex++;
          }
      }

      return currentIndex;
    }
  }
