const selectionSort = function (arr) {
  let arrLength = arr.length;

  for (let i = 0; i < arrLength - 1; i++) {
    let minIndex = i;
    for (let j = i + 1; j < arrLength; j++) {
      if (arr[j] < arr[minIndex]) {
        minIndex = j;
      }
    }
    let temp = arr[i];
    arr[i] = arr[minIndex];
    arr[minIndex] = temp;
  }
  return arr;
};

let array = [17, 5, 6, 2, 4, 19, 0];

console.log(selectionSort([...array]));
