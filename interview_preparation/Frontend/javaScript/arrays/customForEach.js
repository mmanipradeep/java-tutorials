Array.prototype.forEach2 = function(callback,thisCtx){

    if(typeof callback !== 'function'){
        throw '$(callback) is nota function'
    }

    const length =this.length
    let i=0;
    let newArray = []
    while (i < length){

        //DLETED AND UNINITIALIZED VALUES NOT BE ACCESSED
        if(this.hasOwnProperty(i)){
           // callback.call(thisCtx , this[i],i,this)
newArray.push(callback.call(thisCtx , this[i],i,this))
        }
        i++
    }
    return newArray
}


// let demoArr = [1,2,3,4,,5]

// demoArr.forEach2((it,i) => {
//     if(i === 1 ){
//     demoArr.push(5)
// }else if( i === 2){
//     demoArr.splice(3,1,'4-4')
// }
//     console.log(it)
// })
    
    
let arr = [0,1,2,3,4,,5]

let arr2=arr.forEach2(function(it,i,array){
    console.log(it,i,array,this)
return it *it
},{name : 'fatfish'})


console.log(arr2)

