const uppercaseWords = (str) => str.replace(/^(.)|\s+(.)/g, (c) => c.toUpperCase())
const toCamelCase = (str) => str.trim().replace(/[-_\s]+(.)?/g, (_, c) => (c ? c.toUpperCase() : ''));


console.log(uppercaseWords('hello world')); // 'Hello World'

console.log(toCamelCase('background-color')); // backgroundColor
console.log(toCamelCase('-webkit-scrollbar-thumb')); // WebkitScrollbarThumb
console.log(toCamelCase('_hello_world')); // HelloWorld
console.log(toCamelCase('hello_world')); // helloWorld

const removeDuplicates = (arr) => [...new Set(arr)]

console.log(removeDuplicates([1, 2, 2, 3, 3, 4, 4, 5, 5, 6])) 

const flat = (arr) =>
    [].concat.apply(
        [],
        arr.map((a) => (Array.isArray(a) ? flat(a) : a))
    )
// Or
const flat1 = (arr) => arr.reduce((a, b) => (Array.isArray(b) ? [...a, ...flat(b)] : [...a, b]), [])
console.log(flat(['cat', ['lion', 'tiger']]) );
console.log(flat1(['cat', ['lion', 'tiger']]) );


const removeFalsy = (arr) => arr.filter(Boolean)

removeFalsy([0, 'a string', '', NaN, true, 5, undefined, 'another string', false])


const isEven = num => num % 2 === 0

isEven(2) // true
isEven(1) // false



const random = (min, max) => Math.floor(Math.random() * (max - min + 1) + min)

random(1, 50) // 25
random(1, 50) // 34



const average = (...args) => args.reduce((a, b) => a + b) / args.length;

average(1, 2, 3, 4, 5);   // 3


const round = (n, d) => Number(Math.round(n + "e" + d) + "e-" + d)

round(1.005, 2) //1.01
round(1.555, 2) //1.56


const diffDays = (date, otherDate) => Math.ceil(Math.abs(date - otherDate) / (1000 * 60 * 60 * 24));

diffDays(new Date("2021-11-3"), new Date("2022-2-1"))  // 90


// Get the day of the year from a date
const dayOfYear = (date) => Math.floor((date - new Date(date.getFullYear(), 0, 0)) / (1000 * 60 * 60 * 24))

dayOfYear(new Date()) // 74


const randomColor = () => `#${Math.random().toString(16).slice(2, 8).padEnd(6, '0')}`

randomColor() // #9dae4f
randomColor() // #6ef10e


// Convert RGB colour to hex
const rgbToHex = (r, g, b) => "#" + ((1 << 24) + (r << 16) + (g << 8) + b).toString(16).slice(1)

rgbToHex(255, 255, 255)  // '#ffffff'


//clear all cookies

const clearCookies = () => document.cookie.split(';').forEach((c) => (document.cookie = c.replace(/^ +/, '').replace(/=.*/, `=;expires=${new Date().toUTCString()};path=/`)))


//detect dark mode 
const isDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches


//swap variable
[foo, bar] = [bar, foo];



//pause for a whil 

const pause = (millis) => new Promise(resolve => setTimeout(resolve, millis))

const fn = async () => {
  await pause(1000)
  console.log('fatfish') // 1s later
}

fn()