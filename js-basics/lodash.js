// Requiring the lodash library
// Lodash makes JavaScript easier by taking the hassle out of working with arrays, numbers, objects, strings, etc. Lodash’s modular methods are great for:

// Iterating arrays, objects, & strings
// Manipulating & testing values
// Creating composite functions

const _ = require("lodash");
const Cookies = require("js-cookie");
const dayjs = require("dayjs");
// Use of _.forEach() method
_.forEach(['c', 'cpp', 'java','python'], function(value) {
console.log(value);
});

Cookies.set('name', 'fatfish', { expires: 10 });
Cookies.get('name'); // fatfish


const getDate = () => {
    const fillZero = (t) => {
      return t < 10 ? `0${t}` : t
    }
    const d = new Date()
    const year = d.getFullYear()
    const month = fillZero(d.getMonth() + 1)
    const day = fillZero(d.getDate())
    const hour = fillZero(d.getHours())
    const minute = fillZero(d.getMinutes())
    const second = fillZero(d.getSeconds())
   
    return `${year}-${month}-${day} ${hour}:${minute}:${second}`
  }
  console.log(getDate()) // 2022-05-09 07:19:14

  console.log(dayjs().format('YYYY-MM-DD HH:mm:ss'))