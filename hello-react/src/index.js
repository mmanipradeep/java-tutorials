import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

const lakelist = [
"Echo Lake",
"Maud Lake",
"Cascade Lake"
];

function App( { lakes }){
return (
<ul>
{
lakes.map(lake => (<li> {lake}</li>))}
</ul>

);
}

//ReactDOM.render(
//  <React.StrictMode>
//    <App />
//  </React.StrictMode>,
//  document.getElementById('root')
//);
//
//// If you want to start measuring performance in your app, pass a function
//// to log results (for example: reportWebVitals(console.log))
//// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
//reportWebVitals();

let city = {
name: "Chennai",
country : "India"
};

function Car(props) {
  return <h2>I am a {props.color} Car!</h2>;
}

ReactDOM.render(<App  lakes = {lakelist}/>, document.getElementById('root'));
//ReactDOM.render(
//  <h1 id ="heading" className="cool-text"> Hello from {city.name} , {city.country} </h1>,
//    document.getElementById('root')
//);


//ReactDOM.render(React.createElement("div",{style: {color : "blue"}},React.createElement("h1",null,"Hi!!"))
//,document.getElementById("root"));