const swapNumbers = function (arr, i, j) {
  let temp = arr[i];
  (arr[i] = arr[j]), (arr[j] = temp);
  return arr;
};
const reverseArrayUsingRecursion = function (arr, i, j) {
  if (i < j) {
    arr = swapNumbers(arr, i, j);
    swapNumbers(arr, i + 1, j - 1);
  }
};
const arr = [1, 2, 3, 4, 5];
reverseArrayUsingRecursion(arr, 0, arr.length - 1);
console.log(arr);
