import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import FetchApi from './FetchApi'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      
        <h1>Welcome to App component</h1>
        <FetchApi/>

      </>
  )
}

export default App
