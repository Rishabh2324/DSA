//User function Template for javascript

/**
 * @param {string} str
 * @return {string}
*/

class Solution {
    
    reverseWord(str){
        const str_length = str.length;
        let output_str = '';
        if (str_length > 1) {
            let i = str_length - 1;
            while (i >= 0) {
                output_str += str[i];
                i--;
            }
        }else output_str = str;
        return output_str;
    }
}