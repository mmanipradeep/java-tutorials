// Every method tests whether all elments inthe array pass th test implemetned by the provieded functrion. It returns a Boolean Value

let emptyArr = []
// Calling every method on an empty array returns true
console.log(emptyArr.every((it) => it > 0)) // true
// The `callback` method will only be called by an index that has already been assigned a value.
let arr = [ 0, 1, 2, 3, 4,, 5, -1 ]
// The `callback` method will not be called when an array value is deleted or an index that has never been assigned a value.
delete arr[7]

console.log(arr.every((it) => it >= 0)) // true

Array.prototype.every2 = function (callback, thisCtx) {
    if (typeof callback !== 'function') {
      throw `${callback} is not a function`
    }
  
    const length = this.length
    let i = 0
    // If the length of the array is 0, the while loop will not be entered
    while (i < length) {
      // False will be returned as long as a value does not conform to the judgment of callback
      if (this.hasOwnProperty(i) && !callback.call(thisCtx, this[ i ], i, this)) {
        return false
      }
  
      i++
    }
  
    return true
  }

  
