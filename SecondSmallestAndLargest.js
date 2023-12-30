// ALGO

// BRUTE FORCE

// SORT THE ARR
// RETURN SECOND AND LAST SECOND ELEMENT OF THE ARR

// function secondSmallestAndLargest(arr) {
//   if (arr.length > 2) {
//     arr.sort((a, b) => a - b);
//     return arr[1] + " " + arr[arr.length - 2];
//   } else {
//     return -1 + " " + -1;
//   }
// }

// TIME COMPLEXITY
// O(nlogn)
// SPACE COMPLEXITY
// O(n)

/// SOLUTION 2

// ALGO
// 1. INITIALIZE FIRST ELEMENT OF ARERAY AS LARGEST ELEMENT OF ARRAY
// 2. ITERATE OVER ARRAY  COMPARE LARGEST ELEMENT WITH ELEMEMET OF ARRAY AT THAT POSITION
// 3. IF ELEMENT IS GREATER THAN LARGEST ELEMENT OF ARRAY THEN UPDATE VALUE OF LARGEST ELEMENT
// 4. NOW THE ELEMENT AT CURRENT POSITION WHICH IS SMALLER THEN THE LARGEST ELEMENT WILL BE ASSIGNED TO SECOND LARGEST ELEMENT AND SECOND LARGEST ELEMENT SHOULD NOT BE EQUAL TO FIRST LARGEST ELEMENT
// 5. INITIALIZE FIRST ELEMENT OF ARRAY AS SMALLEST ELEMENT OF ARRAY
// 6. ITERATE OVER ARRAY  COMPARE SMALLEST ELEMENT WITH ELEMEMET OF ARRAY AT THAT POSITION
// 7. IF ELEMENT IS SMALLER THAN SMALLEST ELEMENT OF ARRAY THEN UPDATE VALUE OF SMALLEST ELEMENT
// 8. NOW THE ELEMENT AT CURRENT POSITION WHICH IS SMALLER THEN THE SMALLEST ELEMENT WILL BE ASSIGNED TO SECOND SMALLEST ELEMENT AND SECOND SMALLEST ELEMENT SHOULD NOT BE EQUAL TO FIRST SMALLEST ELEMENT

function findSecondLargest(arr) {
  const arrLength = arr.length;
  let largest = arr[0];
  let secondLargest = -1;
  for (let i = 0; i < arrLength; i++) {
    if (arr[i] > largest) {
      secondLargest = largest;
      largest = arr[i];
    } else if (arr[i] > secondLargest && arr[i] != largest) {
      secondLargest = arr[i];
    }
  }
  return secondLargest;
}

function findSecondSmallest(arr) {
  const arrLength = arr.length;
  let smallest = arr[0];
  let secondSmallest = Infinity;
  for (let i = 0; i < arrLength; i++) {
    if (arr[i] < smallest) {
      secondSmallest = smallest;
      smallest = arr[i];
    } else if (arr[i] < secondSmallest && arr[i] != smallest) {
      secondSmallest = arr[i];
    }
  }
  return secondSmallest;
}

function findSecondLargestAndSmallest(arr) {
  const secondLargest = findSecondLargest(arr);
  const secondSmallest = findSecondSmallest(arr);

  return secondLargest + " " + secondSmallest;
}

console.log(findSecondLargestAndSmallest([1, 2, 4, 8, 9, 5]));
