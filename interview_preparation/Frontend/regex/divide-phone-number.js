let mobile = '18379836654' 
let mobileReg = /(?=(\d{4})+$)/g 

console.log(mobile.replace(mobileReg, '-')) // 183-7983-6654