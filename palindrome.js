const isPalindrome = function (x) {
  if (x < 0) return false;
  if (x < 10) return true;
  if (x % 10 === 0 && x !== 0) {
    return false;
  }
  const temp = x.toString();
  let i = 0,
    j = temp.length - 1;

  while (i < j) {
    if (temp[i] !== temp[j]) {
      return false;
    }
    i++;
    j--;
  }
  return true;
};
console.log(isPalindrome(121));
