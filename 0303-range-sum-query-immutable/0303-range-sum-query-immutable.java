class NumArray {
    int[] num1;
    public NumArray(int[] nums) {
        num1=new int[nums.length];
        num1[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            num1[i]=num1[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)return num1[right];
        return (num1[right]-num1[left-1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */