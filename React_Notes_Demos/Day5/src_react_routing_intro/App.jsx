import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import {BrowserRouter,Route,Routes , Link} from 'react-router-dom';

import Home from './Home';
import About from './About';
import Service from './Service';
import Error from './Error';

function App() {
 
  return(
    <>
    <h1>AppComponent</h1>
        <BrowserRouter>

        <center>
            <Link style={{margin:"0px 50px"}} to="/"> Home </Link>    
            <Link style={{margin:"0px 50px"}} to="/about"> AboutUs </Link>    
            <Link style={{margin:"0px 50px"}} to="/service"> Service </Link> 
            </center>
            <hr/>    




            <Routes>
                <Route exact path='/' element={<Home/>}></Route>
                <Route path='/about' element={<About/>}></Route>
                <Route path='/service' element={<Service/>}></Route>
                <Route path='*' element={<Error/>}></Route>
            </Routes>
        </BrowserRouter>
    </>
  )
}

export default App
