const factorial = function (N) {
  if (N == 1) return 1;
  else return N * factorial(N - 1);
};

console.log(factorial(6));
