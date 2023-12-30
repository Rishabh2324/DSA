// ALGO
// SOLUTION 1

// BRUTE FORCE
// SORT ARR IN ASCENDING ORDER AND THEN PICK THE LAST ELEMENT OF THE ARRAY

function sortArr(arr) {
  arr.sort(a, (b) => a - b);
  return arr[arr.length - 1];
}

// TIME COMPLEXITY
// JS sort=
// O(nlogn)
// Space complexity
// O(N)

// SOLUTION 2

// DECLARE FIRST ELEMENT OF ARRAY AS LARGEST
// LOOP THROUGH ARRAY TO FIND NEXT LASRGEST
// WHEN LOOP ENDS YOU WILL HAVE LASRGEST ELEMENT OF ARRAY

function sortArr(arr) {
  const arrLength = arr.length;
  let maxElement = arr[0];
  for (let i = 0; i < arrLength; i++) {
    maxElement = Math.max(arr[i], maxElement);
  }
  return maxElement;
}

// TIME COMPLEXITY
// O(N)
// SPACE COMPLEXITY
// O(1)
