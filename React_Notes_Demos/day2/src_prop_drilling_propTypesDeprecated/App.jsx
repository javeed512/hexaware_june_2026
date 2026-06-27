import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import { Student } from './Student'

function App(props) {
 

  return (
    <>
      
        <h1>Welcome  {props.name} to App component</h1>
        <h2>IsActive {props.isActive}</h2>
        <Student  name={props.name}  rollno={props.rollno}> </Student>

      </>
  )
}

export default App
