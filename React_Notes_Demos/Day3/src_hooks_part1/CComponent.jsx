import { UserContext } from "./AComponent";

export function CComponent(){


    return(


            <div>
                     <h1>CComponent </h1>

                <UserContext.Consumer>
                    {

                            (data)=>{

                                    return <h1>  The amount value from AComponent is : {data} </h1>

                            }


                    }


                </UserContext.Consumer>

            </div>

   

    )

}