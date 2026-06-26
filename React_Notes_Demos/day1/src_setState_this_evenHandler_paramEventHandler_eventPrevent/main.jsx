import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App.jsx'
import { Student } from './Student.jsx'

import { Employee } from './Employee.jsx'

import PreventEventDemo from './PreventEventDemo.jsx'
import { ParamEventHandler } from './ParamEventHandler.jsx'

import { Customer } from './Customer.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
      
    <App/>

    <Customer  amount="7000"></Customer>

    <Employee name="javeed"></Employee>

    <ParamEventHandler></ParamEventHandler>

  
    <PreventEventDemo></PreventEventDemo>

    <Student></Student> 



      
  </StrictMode>
)
