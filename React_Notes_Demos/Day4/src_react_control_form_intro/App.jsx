import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import { Form1 } from './Form1'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      
        <h1>Welcome to App component</h1>
        <div>
                           <form>
                            <h2>Controlled by React Demo1 using defaultValue</h2>
                            <input type="text" defaultValue="edx"/>
                            </form>

                            <br></br>
                            
                            <Form1/>
        </div>

      </>
  )
}

export default App
