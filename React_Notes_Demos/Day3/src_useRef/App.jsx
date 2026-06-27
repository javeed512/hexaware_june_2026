import { useRef, useState } from "react";


export   function  App(){
    

    const[name,setName]  = useState("");

        const ref =useRef();

    const handleClick = () => {

            // this data will render

           //     setName('Javeed');


            // this data will not render
            ref.current.value = 'Javeed Khan'


    }



        return(

                <>
                
                    <h1> Name : {name}</h1>

                    <button type="button"  onClick={handleClick}>Click</button>
                
                </>


        )



}