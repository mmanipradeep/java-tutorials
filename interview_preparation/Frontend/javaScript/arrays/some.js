//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/some

Array.prototype.some2 = function (callback, thisCtx) {
    if (typeof callback !== 'function') {
      throw `${callback} is not a function`
    }
  
    const length = this.length
    let i = 0
  
    while (i < length) {
      // Returns true if any element meets the callback condition
      if (this.hasOwnProperty(i) && callback.call(thisCtx, this[ i ], i, this)) {
        return true
      }
  
      i++
    }
  
    return false
  }

  let emptyArr = []
// An empty array will return false
console.log(emptyArr.some2((it) => it > 0)) // false

let arr = [ 0, 1, 2, 3, 4,, 5, -1 ]

delete arr[7]

console.log(arr.some2((it) => it < 0)) // false
console.log(arr.some2((it) => it > 0)) // true