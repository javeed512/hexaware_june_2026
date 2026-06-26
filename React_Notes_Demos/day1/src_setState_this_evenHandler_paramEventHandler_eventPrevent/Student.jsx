import { Component } from "react";



export class Student  extends Component{

    

        constructor(props){  // binding  this keyword or current class object to the handleClick func

                super(props);

                this.handleClick = this.handleClick.bind(this);



        }


            handleClick2 =  ()=>{


                    console.log('handleClick() is called.. click event handled',this);

            }

            handleClick(){

                console.log('handleClick() is called.. click event handled',this);



            }



      render(){

                return(

                        <div>
                                <h1>ReactEvent in Class</h1>
                        <button className="btn btn-primary" type="button"  onClick={this.handleClick}>Button1</button> <br/>
                        <button  className="btn btn-success"     type="button"  onClick={this.handleClick2}>Button2</button>

                        </div>


                )
        
    
    }




}