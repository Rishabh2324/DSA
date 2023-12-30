const twoSum = function (arr, target) {
  let diffMap = {};

  for (let i = 0; i < arr.length; i++) {
    if (diffMap[target - arr[i]] >= 0) {
      return [diffMap[target - arr[i]], i];
    } else {
      diffMap[arr[i]] = i;
    }
  }
  return [];
};

console.log(twoSum([2, 7, 11, 15], 9));
