import { Component } from "react";

import { setState } from 'react';


export  class  Employee  extends Component {  // stateful



       

        constructor(props){

                super(props);
                console.log('Employee component object created..');

                this.state ={

                        id:201,
                        name:"Hussain",
                        city: this.props.city

                    

                }



        }


      render(){


            return (

                    <>
                <h2>Welcome to Class Component</h2>
                <h2>Eid:{ this.props.eid}</h2>
                <h2>Ename:  {this.props.ename}</h2>

                <h2> id: {this.state.id}</h2>
                <h2> Name: {this.state.name}</h2>
                <h2>City: {this.state.city}</h2>
                <button  onClick={this.change} >Click</button>

                    </>
            );


      }





}