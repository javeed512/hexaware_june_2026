import { BComponent } from "./BComponent";
import { CComponent } from "./CComponent";
import { createContext } from 'react';


export const  UserContext =  createContext();

export function AComponent(){


           


        return(

                <>
                   <h1>AComponent </h1>

                   <UserContext.Provider  value={ 7000 } >

                       <BComponent></BComponent> 
                  
                    <CComponent></CComponent>

                   </UserContext.Provider>
                
                
                
                </>
         


        )

}