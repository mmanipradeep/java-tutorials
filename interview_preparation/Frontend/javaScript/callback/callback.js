function test1() {
console.log('i am function1');
}
function test2() {
console.log('i am function2');
}
function test3() {
console.log('i am function3');
}
function callbackTest(arrFunc) {
arrFunc.forEach((item) => item());
}
var arrFunc = [test1, test2, test3];
callbackTest(arrFunc);