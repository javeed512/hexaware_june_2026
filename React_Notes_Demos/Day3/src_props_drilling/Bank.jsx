import { Customer } from "./Customer";



export function Bank(props){


    return (


            <>
                <h1> Bank Component Data : {props.data}</h1>
            
                <Customer  data={props.data}></Customer>
            </>

    )





}