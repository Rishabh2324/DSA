const armstrongNumber = function (N) {
  let sum = 0;
  let test = N;
  let totalDigits = N.toString().length;
  while (test > 0) {
    sum += Math.pow(test % 10, totalDigits);
    test = Math.floor(test / 10);
  }
  return sum === N;
};

console.log(armstrongNumber(370));
