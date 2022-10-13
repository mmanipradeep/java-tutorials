const checkProtocol = /^https?:/

console.log(checkProtocol.test('https://medium.com/')) // true
console.log(checkProtocol.test('http://medium.com/')) // true
console.log(checkProtocol.test('//medium.com/')) // false