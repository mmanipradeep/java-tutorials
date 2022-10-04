const regex = RegExp('foo*','g');
const str1 =  'table football, foosball';
let array1;

while ((array1 =regex.exec(str1))!== null){
    console.log(`Found ${array1[0]}.Next starts at ${regex.lastIndex}.`);
}


//Regular expression with the /g flag
const regex1 = /e(xam)(ple(\d?))/g;
//Reference string
const str = 'example1example2example3';
  
//Using matchAll() method
const array = [...str.matchAll(regex1)];
  
console.log(array[0]);
console.log(array[1]);
console.log(array[2]);
