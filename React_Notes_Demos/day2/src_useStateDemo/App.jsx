import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'

function App() {
  const [count, setCount] = useState(0)
  const[id,setId] = useState(0);
  const[name,setName] = useState('tom')

  return (
    <>
      
        <h2>{name}</h2>
        <h1>Welcome to App component</h1>
        <h2>Count : {count}</h2>

        <button  onClick={ ()=>{setCount(count+1)} } >Increase</button>
        <button  onClick={ ()=>{setCount(count-1)} } >Decrease</button>
        <button  onClick={ ()=>{setCount(0)} } >Reset</button> <br/>

        <button  onClick={ ()=>{setName(name.toUpperCase())} } >UpperCase</button>

      </>
  )

  
}




export default App
