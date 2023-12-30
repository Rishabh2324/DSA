const countDigits = function (N) {
  let S = 0;
  let totalDigits = 0;

  while (S !== N) {
    totalDigits++;
    S = N % Math.pow(10, totalDigits);
  }
  return totalDigits;
};

console.log(countDigits(1));
