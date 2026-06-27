import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App';
import { UseRefDemo2 } from './UseRefDemo2';

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      

  <App></App>

  <UseRefDemo2></UseRefDemo2>


      
  </StrictMode>
);




