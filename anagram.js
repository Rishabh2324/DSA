var isAnagram = function (s, t) {
  if (s.length !== t.length) return false;
  else {
    let frequencyMap = {};
    let secondFrequencyMap = {};

    for (let i = 0; i < s.length; i++) {
      frequencyMap[s[i]] = (frequencyMap[s[i]] || 0) + 1;
      secondFrequencyMap[t[i]] = (secondFrequencyMap[t[i]] || 0) + 1;
    }

    for (const key in frequencyMap) {
      if (frequencyMap[key] !== secondFrequencyMap[key]) {
        return false;
      }
    }
    return true;
  }
};

console.log(isAnagram("rac", "cat"));
