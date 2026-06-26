import { Component } from "react";


export  class  Employee  extends Component {


      render(){


            return (

                    <>
                <h2>Welcome to Class Component</h2>
                <h2>Eid:{ this.props.eid}</h2>
                <h2>Ename:  {this.props.ename}</h2>

                    </>
            );


      }



}