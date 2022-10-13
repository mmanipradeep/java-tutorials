const capitalize = (string) => {
  const capitalizeRegex = /(?:^|\s+)\w/g
  return string.toLowerCase().replace(capitalizeRegex, (match) => match.toUpperCase())
}

console.log(capitalize('hello world')) // Hello World
console.log(capitalize('hello WORLD')) // Hello World