const maxProfit = function (prices) {
  let minProfitDay = 0;
  let maxProfitDay = 1;
  let profit = 0;
  while (maxProfitDay < prices.length) {
    if (prices[minProfitDay] < prices[maxProfitDay]) {
      profit = Math.max(profit, prices[maxProfitDay] - prices[minProfitDay]);
    } else {
      minProfitDay = maxProfitDay;
    }
    maxProfitDay++;
  }
  return profit;
};

console.log(maxProfit([7, 6, 4, 3, 1]));
