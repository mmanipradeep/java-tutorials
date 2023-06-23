let roman = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    c: 100,
    D: 500,
    M: 1000,

};

var romanToInt = function (s){
    value =0;
    for(let i=0;i<s.length;i++){
        roman[s[i]] < roman[s[i+1]]
        ? (value -= roman[s[i]])
        :(value += roman[s[i]]);
    }
    return value;
};

console.log(romanToInt("IV"))