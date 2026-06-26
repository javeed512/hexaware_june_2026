import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import { Button } from './Button'
import { Employee } from './Employee'
import { Student } from './Student'

function App(props) {
  return (

    <div>
  
     <h1>Welcome to ReactJS using VITE  {props.username}</h1>

      <Button  name="login" ></Button>
      <Button  name="reset" ></Button>
      <Button  name="submit" ></Button>
      <Button  name="add" ></Button>

      <br></br>

      <Employee  eid={101}  ename="tom" city="Delhi"></Employee>

      <Student sname="Imam Hussain" />


      </div>

  );
}

export default App
