Array.prototype.find2 = function (callback, thisCtx) {
    if (typeof callback !== 'function') {
      throw `${callback} is not a function`
    }
    const length = this.length
    let i = 0
    while (i < length) {
      const value = this[ i ]
      // As long as there is an element that matches the logic of the callback function, the element value is returned
      if (callback.call(thisCtx, value, i, this)) {
        return value
      }
      i++
    }
    // otherwise return undefined  
    return undefined
  }


  let arr = [ 0, 1, 2, 3, 4,, 5 ]
let ele = arr.find2(function (it, i, array) {
  console.log(it, i, array, this)
  return it > 3
}, { name: 'fatfish' })
console.log(ele) // 4