/**
 * @param {number[]} arr
 * @param {number} n
 * @returns {number}
*/

class Solution{
    findSum(A,N){
        
        // Check length of array if length of array is equal to one then max and min will be single element  
        // else if length is greater then one initialise max and min using first and second element by comparing them
        // Start iterate over array and compare elements in pair
        // if A[i] > A[i+1] then compare for max with A[i] and min with A[i+1]
        // else A[i] < A[i+1] then compare for max with A[i + 1] and min with A[i]
        // Return sum of max and min
    
        let max;
        let min;
        if (N == 1) {
            max = A[0];
            min = A[0];
        }else {
            if(A[0] > A[1]) {
                max = A[0];
                min = A[1];
            }else {
                max = A[1]
                min = A[0];
            }
            
            let i  = 2;
            while (i < N) {
                if(A[i] > A[i+1]) {
                    if(A[i] > max) {
                        max = A[i]
                    }
                    if( A[i+1] < min) {
                        min = A[i + 1]
                    }
                } else {
                    if(A[i + 1] > max) {
                        max = A[i + 1]
                    }
                    if( A[i] < min) {
                        min = A[i]
                    }
                }
                i++;   
            }
        }
        return min + max
    }
}