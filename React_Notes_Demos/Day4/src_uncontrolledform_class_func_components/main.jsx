import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App';

import UseRefDemo from './UseRefDemo';

import  "../node_modules/bootstrap/dist/css/bootstrap.css";

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      

    <App></App>

    <UseRefDemo></UseRefDemo>


      
  </StrictMode>
);




