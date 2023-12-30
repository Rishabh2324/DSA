const countGoodSubstrings = function (s) {
  let sLength = s.length;
  if (sLength < 3) return 0;
  else {
    let goodSubstrings = 0;
    for (let i = 1; i < sLength - 1; i++) {
      if (s[i] !== s[i - 1] && s[i] !== s[i + 1] && s[i - 1] !== s[i + 1]) {
        goodSubstrings++;
      }
    }
    return goodSubstrings;
  }
};

console.log(countGoodSubstrings("bab"));
