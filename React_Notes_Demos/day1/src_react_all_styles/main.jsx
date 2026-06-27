import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App.jsx'
import { MyStyleComp } from './MyStyleComp.jsx'


createRoot(document.getElementById('root')).render(
  <StrictMode>
      
    <App/>
    <MyStyleComp/>
      
  </StrictMode>
)
