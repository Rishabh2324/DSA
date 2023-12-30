const printNameNtimesUsingRecursion = function (N) {
  if (N == 0) return 0;
  else {
    return N + printNameNtimesUsingRecursion(N - 1);
  }
};

console.log(printNameNtimesUsingRecursion(5));
