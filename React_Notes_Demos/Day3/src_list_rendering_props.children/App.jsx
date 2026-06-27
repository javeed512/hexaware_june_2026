import Products from "./Products";

import Address from "./Address";


export function   App(){


    const numbers = [101,102,103,104,105];


      const listItems =      numbers.map( (num,index)=>{  

                  return  <li key={index}> {index} : {num}</li>

            });



            const products = [

                {id:101,name:"Mobile",price:12000},
                {id:102,name:"Laptop",price:42000},
                {id:103,name:"Charger",price:1000},
                {id:104,name:"PowerBank",price:3000},
                {id:105,name:"Keyboard",price:900}
        
        
        ];



      const   productList =       products.map(

                        (prod)=>{

                                return <tr  ><td>{prod.id}</td><td>{prod.name}</td><td>{prod.price}</td></tr>


                        }


                );



      const mybuttons =  products.map(


                        (p)=>{
                                    return  <button  className="btn btn-primary">{p.name}</button>

                        }

      );


          return(

                <div>
                
                    <ul>{listItems}</ul>  <br /> <br />

                    
                    <table> {productList}</table>    <br /> <br />

                    {mybuttons}

                    <br />



                        
                 <Products>

                                <Address></Address>

                </Products>



                
                </div>



          )  



}