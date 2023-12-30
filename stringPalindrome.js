const isPalindrome = function (str, i, j) {
  if (i > j) return true;
  if (str[i] != str[j]) return false;
  return isPalindrome(str, i + 1, j - 1);
};
const str = "ABCDCBA";
console.log(isPalindrome(str, 0, str.length - 1));
