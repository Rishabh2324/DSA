const bubbleSort = function (arr) {
  const arrLength = arr.length;
  for (let i = arrLength - 1; i > 0; i--) {
    let didSwap = 0;
    for (let j = 0; j < i; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;
        didSwap = 1;
      }
    }
    if (didSwap == 0) {
      break;
    }
  }
  return arr;
};

const arr = [2, 4, 6, 8, 10];
console.log(bubbleSort([...arr]));
