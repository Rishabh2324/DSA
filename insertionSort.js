const insertionSort = function (arr) {
  const arrLength = arr.length;

  for (let i = 0; i < arrLength; i++) {
    let j = i;

    while (j > 0 && arr[j - 1] > arr[j]) {
      let temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
      j--;
      console.log("Hii");
    }
  }
  return arr;
};
const arr = [5, 4, 3, 2, 1, 0];
console.log(insertionSort(arr));
