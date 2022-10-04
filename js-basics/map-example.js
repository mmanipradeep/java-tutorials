const map1 =new Map();
console.log(map1);

let map =new Map();

map.set('info',{name : 'John' ,age:22});
console.log(map);
console.log(map.get('info'));
console.log(map.has('info'));
console.log(map.delete('info'));// remove particular element
console.log(map.clear('info'));// remove all

let map2 =new Map();

let Obj ={};
map2.set(Obj,{name : 'John' ,age:22});
console.log(map2);


// Iterate Map

let iterateMap =new Map();
iterateMap.set('name','john');
iterateMap.set('age','22');

for(let [key ,value ] of iterateMap){
    console.log(key+'-'+value);
}
// iterate using key
for (let key of iterateMap.keys()){
    console.log(key);
}

// iterate using values 
for (let values of iterateMap.values()){
    console.log(values);
}

//iterate using entries
for(let [key, value] of iterateMap.entries()){
    console.log(key + " = " + value);
}