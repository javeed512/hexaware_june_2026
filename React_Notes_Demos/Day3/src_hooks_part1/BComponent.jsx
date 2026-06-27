import { UserContext } from "./AComponent";


export function BComponent(){


    return(

            <>
             <h1>BComponent </h1>
            
               <UserContext.Consumer>
                
                {
                        (x)=>{  return  <h1> The value from AComponent into BComponent: {x}  </h1>}



                }
                
                
                
                </UserContext.Consumer> 

            
            </>
       

    )

}