import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App';
import Products from './Products';
import Address from './Address';

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      

    <App></App>

    {/* <Products city="Mumbai"></Products> */}




      
  </StrictMode>
);




