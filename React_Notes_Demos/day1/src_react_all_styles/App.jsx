
import './App.css'

import  s1 from   './mystyles.module.css'

export function  App(){


    const mystyle = {
        color: "white",
        backgroundColor: "Pink",
        padding: "20px",
        fontFamily: "Italic"
      };


    return <>
           
            <h1  style={{color:"red"}}>Hello friends</h1>
            <h1  style={mystyle} > Welcome to React</h1>
    
                <h2>This is External CSS </h2>

                <h3 id="myId">This is CSS ID</h3>
                <h4 className="myClass">This is CSS Class</h4>

                <h5 className={s1.mystyle}>This is module css</h5>

                <p className={s1.parastyle}>This is  param with module css</p>
            </>


}