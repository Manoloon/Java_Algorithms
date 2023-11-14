public static boolean findInteger(int[] nums, int search) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == search || nums[right] == search) {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
