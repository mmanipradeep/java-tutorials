let a = [1,2,3]
let b = [4,5,6]
//a.push(b);
//console.log(a); //[ 1, 2, 3, [ 4, 5, 6 ] ]

//c=a.concat(b);
//console.log(c);//[ 1, 2, 3, 4, 5, 6 ]

//a.push(...b);
//console.log(a);//[ 1, 2, 3, 4, 5, 6 ]

//a= [...a,...b];
//console.log(a);//[ 1, 2, 3, 4, 5, 6 ]

var arr1 =[1,2,3];
var arr2=[4,5,6];


//for (var i =0;i<arr2.length;i++){
  //  arr1.push(arr2[i]);

//}
//console.log(arr1);


//splice used to add and remove from array


arr1.splice(arr1.length,0,arr2);
console.log(arr1);//[ 1, 2, 3, [ 4, 5, 6 ] ]

const arr=[1,2,3,4];
console.log(arr.at(2));
console.log(arr.at(-2));



