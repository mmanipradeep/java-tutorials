const trim1 = (str) => {
  return str.replace(/^\s*|\s*$/g, '')    
}

const string = '   hello medium   '
const noSpaceString = 'hello medium'
const trimString = trim1(string)

console.log(string)
console.log(trimString, trimString === noSpaceString)
console.log(string)


const trim2 = (str) => {
  return str.replace(/^\s*(.*?)\s*$/g, '$1')    
}

const string = '   hello medium   '
const noSpaceString = 'hello medium'
const trimString = trim2(string)

console.log(string)
console.log(trimString, trimString === noSpaceString)
console.log(string)