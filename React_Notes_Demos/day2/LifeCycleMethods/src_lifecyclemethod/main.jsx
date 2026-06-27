import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import Mounting from  './Mounting.jsx'
import Updating from './Updating.jsx'

import UnMounting from './UnMounting.jsx'

createRoot(document.getElementById('root')).render(
  
  <StrictMode>
    {/* <Mounting  favcolor="yellow" /> */}

    {/* <Updating favcolor="blue"/> */}

    <UnMounting>  </UnMounting>
  </StrictMode>,
)
