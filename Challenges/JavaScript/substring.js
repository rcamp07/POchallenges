const getVowelSubstrings = str => {
    const vowels = ['a', 'e', 'i', 'o','u'];
    let subArray = [];
  
  
    for (i = 0; i < str.length; i++){
      for(j = 1; j <= str.length; j++){
        let sub = str.substring(i, j);
        if (vowels.includes(sub.charAt(0)) && vowels.includes(sub.charAt(sub.length-1)) && !subArray.includes(sub)){
          subArray.push(sub);
        }
      }
    }
    return subArray.sort();
  }
  
const getConsonantSubstrings = str => {
    const vowels = ['a', 'e', 'i', 'o','u'];
    let subArray = [];
  
    for(i = 0; i <str.length; i++) {
      for (j=1; j <=str.length;j++){
        let sub = str.substring(i,j);
        if (!vowels.includes(sub.charAt(0)) && !vowels.includes(sub.charAt(sub.length-1)) && sub != '' && !subArray.includes(sub)){
          subArray.push(sub);
        }
      }
    }
    return subArray.sort();
}
console.log(getVowelSubstrings('apple'));
console.log(getVowelSubstrings('pearlo'));
console.log(getVowelSubstrings('aviation'));
console.log(getConsonantSubstrings('aviation'));
console.log(getConsonantSubstrings('motor'));