import { Component } from "react";

import React from "react";

export class App   extends Component {



        constructor(props){

                super(props);

                this.state = {

                        uname:"",
                        pwd:""

                }


              this.userInput =  React.createRef();
              this.passInput = React.createRef();





        }


           handleSubmit = (e)=>{

                    e.preventDefault();

                  this.setState({uname:this.userInput.current.value , pwd:this.passInput.current.value})


           } 




    render()
    {
                return (


                        <>

                            <h1>Your Name is : {this.state.uname}</h1>
                            <h1>Your Password is : {this.state.pwd}</h1>

                        <form   onSubmit={this.handleSubmit}>

                            UserName : <input type="text"  className="form-control"   ref={this.userInput}/>
                            Password:  <input type="password" className="form-control"  ref={this.passInput}/>
                            <button type="submit" className="btn btn-primary mt-4">Submit</button>


                        </form>

                        
                        </>

                )



            }




}