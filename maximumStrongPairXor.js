const maximumStrongPairXor = function (nums) {
  let maxXOR = 0;
  for (let i = 0; i < nums.length; i++) {
    for (let j = i; j < nums.length; j++) {
      if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[j], nums[i]))
        maxXOR = Math.max(maxXOR, nums[i] ^ nums[j]);
    }
  }
  return maxXOR;
};

console.log(maximumStrongPairXor([10, 100]));
