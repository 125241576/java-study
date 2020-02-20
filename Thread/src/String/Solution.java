package String;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length;i++)
            {
                if(nums[i]+nums[j]==target) {
                	int[] ans= {i,j};
                	return ans;
                }
                else if(nums[i]+nums[j]>target)
                    break;
            }
        throw new IllegalArgumentException("No two sum solution");
    }

}
