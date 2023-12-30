let c = 0;
const basicRecursion = function () {
  console.log(c);
  if (c === 10) return;
  c++;
  basicRecursion();
};

basicRecursion();
