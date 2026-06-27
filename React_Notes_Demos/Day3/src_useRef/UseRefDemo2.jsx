

import {useState,useRef,useEffect} from 'react';

export function UseRefDemo2(){

    const [inputValue , setInputValue]=useState("");
    const count=useRef(0);
   

    useEffect( ()=>{

            count.current = count.current + 1;


    } );



        return (


            <div>

    Enter Text : <input type="text"  value={inputValue}  onChange={ (e)=> setInputValue(e.target.value)}  />

                    <br />
                    <h1>Count Render : {count.current}</h1>

            </div>


        )


}