// x.y.z
const versionRegexp = /^(?:\d+\.){2}\d+$/

console.log(versionRegexp.test('1.1.1'))
console.log(versionRegexp.test('1.000.1'))
console.log(versionRegexp.test('1.000.1.1'))