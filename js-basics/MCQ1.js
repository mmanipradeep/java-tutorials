
// 👉 MCQ-1
function MCQ1() {
    const person = {
      name: "Jayesh",
      displayName1: function () {
        console.log("name1", this.name);
      },
      displayName2: () => {
        console.log("name2", this.name);
      },
    };
    person.displayName1();
    person.displayName2();
  
    // 👍A) name1 Jayesh , name2 Jayesh
    // 💡B) name1 Jayesh , name2 undefined
    // 💖C) name1 Jayesh , name2
    // 😀D) name1 , name2 Jayesh
  
    /* 
    In window browser answer is C) name1 Jayesh , name2 because arrow function inherits "this" from its outer function where "this" is window.
    and window has by default property name that is used for setting or returning the name of a window and in above case window.name is empty string.
    
    In other compilers answer is B) name1 Jayesh , name2 undefined because arrow function inherits "this" from its outer function where "this" refers to global object.
    */
  }
  // MCQ1();
  
  // 👉 MCQ-2
  function MCQ2() {
    let name = "Jayesh";
    function printName() {
      if (name === "Jayesh") {
        let name = "JC";
        console.log(name);
      }
      console.log(name);
    }
    printName();
  
    // 👍A) Jayesh     💡B) Jayesh, JC
    // 💖C) JC, JC     😀D) JC, Jayesh
  
    /* Answer is D) JC, Jayesh because let variables are block scope, name inside if condition will shadow outer name*/
  }
  // MCQ2();
  
  // 👉 MCQ-3
  function MCQ3() {
    var player = "Virat";
    function displayPlayer() {
      if (player === "Virat") {
        var player = "VK";
        console.log(player);
      }
      console.log(player);
    }
    displayPlayer();
  
    // 👍A) VK, Virat    💡B) VK, VK
    // 💖C) undefined    😀D) VK, undefined
  
    /* 
     Answer is C) undefined because var variables are functional scope, When displayPlayer fn starts executing, Execution context of
     displayPlayer will be created in callstack and at the memory creation phase var variable player is initialized as undefined. 
     hence if condition will become false and It will print only undefined.
    */
  }
  // MCQ3();
  
  // 👉 MCQ-4
  function MCQ4() {
    const person = {
      name: "Jayesh",
      age: 24,
    };
  
    const getAge = person.age;
    delete person.age;
  
    console.log(person);
    console.log(getAge);
  
    // 👍A) { name: 'Jayesh', age: 24 }, null
    // 💡B) { name: 'Jayesh' }, 24
    // 💖C) { name: 'Jayesh' }, undefined
    // 😀D) { name: 'Jayesh', age: 24 }, 24
  
    /*
    Answer is B) { name: 'Jayesh' }, 24 beacuse delete keyword deletes property of an object and does not delete property's value.
   */
  }
  // MCQ4();