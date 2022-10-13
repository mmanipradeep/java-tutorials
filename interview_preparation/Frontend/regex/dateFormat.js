const checkDateRegexp = /^\d{4}([-\.\/])(?:0[1-9]|1[0-2])\1(?:0[1-9]|[12]\d|3[01])$/

console.log(checkDateRegexp.test('2021-08-22')) // true
console.log(checkDateRegexp.test('2021/08/22')) // true
console.log(checkDateRegexp.test('2021.08.22')) // true
console.log(checkDateRegexp.test('2021.08/22')) // false
console.log(checkDateRegexp.test('2021/08-22')) // false