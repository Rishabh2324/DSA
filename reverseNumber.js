const reverseNumber = function (x) {
  let S = 0;
  let N = x;
  let bit = Math.pow(2, 31) - 1;
  if (x < 0) N = Math.abs(N);
  while (N != 0) {
    S = S * 10 + (N % 10);
    N = Math.floor(N / 10);
  }
  S = x < 0 ? -S : S;
  if (S < -bit || S > bit) return 0;
  return S;
};

console.log(reverseNumber(123));
