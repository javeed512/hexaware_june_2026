import { Component } from "react";


export class Employee extends  Component{


            constructor(props){

                    super(props);

                    this.state = {

                            eid:101,
                            ename:this.props.name  // ename = javeed


                    }




            }



              handleClickEvent = ()=>{

                    console.log('handleClick() is called event handled ',this)

                    this.setState({ename:'King' , eid: 111});

              }  



    render(){



            return(

                    <>

                        <h1>Eid:  {this.state.eid}</h1>
                        <h1>Ename: {this.state.ename}</h1>
                        <button className="btn btn-warning" type="button"  onClick={this.handleClickEvent}>ChangeName</button> <br/>
                   
                        <h2>Ename from Props:  {this.props.name}</h2>
                    </>


            )





    }





}