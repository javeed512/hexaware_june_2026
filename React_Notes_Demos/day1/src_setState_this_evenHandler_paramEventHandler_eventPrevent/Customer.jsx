import { Component } from "react";


export class  Customer extends Component{

        state = {


            cid:101,
            cname:"Ford",
            amount: 8000



        }


          handleClick = ()=>{


                this.setState( (state,props)=>{

                    return {cid:111 , cname:"Black Ford" , amount: this.props.amount};

                });


                
                        // this.setState(function(state,props){

                        //             console.log('previous state values ',state);

                        //             console.log('this key ',this);

                        //             return {cid:111 , cname:"Black Ford" , amount: 12000};

                        // });

                        console.log('after ',this)

          }  




    render(){


            console.log('before ',this)

            return(

                        <>
                            <h1>Cid: {this.state.cid}</h1>
                            <h1>CName: {this.state.cname}</h1>
                            <h1>Amount: {this.state.amount}</h1>
                            <button type="button"  onClick={this.handleClick}>Click</button>
                        
                        </>


            )



    }





}