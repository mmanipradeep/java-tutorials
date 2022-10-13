const camelCase = (string) => {
  const camelCaseRegex = /[-_\s]+(.)?/g
  return string.replace(camelCaseRegex, (match, char) => {
    return char ? char.toUpperCase() : ''
  })
}

console.log(camelCase('foo Bar')) // fooBar
console.log(camelCase('foo-bar--')) // fooBar
console.log(camelCase('foo_bar__')) // fooBar