package leetCode;

public class Binary_Search {


    public int searchInsert(int[] nums, int target) {


        int start = 0;
        int end = nums.length - 1;


        if (nums[start] == target) return start;
        else if (nums[end] == target) return end;


        while (start <= end) {

            int middle = (start + end) / 2;

            if (nums[middle] == target)
                return middle;

            if (nums[middle] < target) start = middle + 1;
            else end = middle - 1;

        }

        return start;


    }
}
