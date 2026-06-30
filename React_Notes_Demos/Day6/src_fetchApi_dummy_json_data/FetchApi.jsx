import { useState } from "react";

function FetchApi()
{

    const [data,setData]= useState([]);
    const apiGet=()=>
    {
       // fetch("http://localhost:3000/employees")

       fetch("https://jsonplaceholder.typicode.com/users")
        .then((response)=> response.json())
        .then((json)=>
        {
            console.log(json)
            //set the data to  state
            setData(json);
        });
    }
    return (
        <>
            <h1>FETCH API</h1> 
            <button onClick={apiGet}>Fetch API Button</button>
            <br></br>   
            {JSON.stringify(data)} 
        </>	
    )
}
export default FetchApi;