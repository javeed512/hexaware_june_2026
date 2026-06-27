import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import UseStateApp from './UseStateApp'
import { UseEffectApp } from './UseEffectApp';
import { AComponent } from './AComponent';
import { BComponent } from './BComponent';
import { CComponent } from './CComponent';

import { UseReducerApp } from './UseReducerApp';

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      

    {/* <UseStateApp></UseStateApp> */}

    {/* <UseEffectApp></UseEffectApp> */}
{/* 
    <AComponent></AComponent> */}   {/*  for createContext hook we use A,B, C Components*/}   


    <UseReducerApp></UseReducerApp>

   
      
  </StrictMode>
);




