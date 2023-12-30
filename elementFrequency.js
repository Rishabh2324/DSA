const elementFrequency = function (arr) {
  const feqMap = {};
  for (let i = 0; i < arr.length; i++) {
    feqMap[arr[i]] = (feqMap[arr[i]] || 0) + 1;
  }
  console.log(feqMap);
};

console.log(elementFrequency([1, 2, 3, 3]));
