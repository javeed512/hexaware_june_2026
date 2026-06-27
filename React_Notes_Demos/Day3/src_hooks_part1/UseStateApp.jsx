import { useState } from "react";





export default function UseStateApp(){


        const nameStateVar = useState('King');

        const name = nameStateVar[0];
        const updateName = nameStateVar[1];


         const [city,setCity]  = useState('Hyderabad');
             
        const  update = ()=>{


              //  updateName('Javeed');

                nameStateVar[1]('King khan');

        }



        const  change = ()=>{

                    setCity('Delhi');


        }


    return (
        

            <>
            
                <h1></h1>

                <h1>nameStateVar[0] : {nameStateVar[0]}</h1>
               
              
                <h1>name : {name}</h1>

                    <h2>City : {city}</h2>
               

                <button type="button"  onClick={update}>Update</button> <br />
             
                <button type="button"  onClick={change}>Change</button>
            
            </>


    )




}