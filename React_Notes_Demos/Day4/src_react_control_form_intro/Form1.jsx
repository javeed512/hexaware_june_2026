import { Component } from "react";


export class Form1 extends Component{



    state={
        value:"GlobalEdx",
        count:0,
        txtArea:"Hello Student, This is React Controlled component text area"
    }

    handler = (e)=>{

        console.log('onchange() executed event occur')

        console.log(e.target.value);

        // this.setState({value:"Hexaware" , count:this.state.count+1});
        this.setState({value:e.target.value.toUpperCase() , count:this.state.count+1});

    
    }

    txtHandler = (e)=>{

            this.setState({txtArea:e.target.value})


    }



render() {
        return (
                <div>
                   <form>
                    <h2>Controlled by React using State {this.state.count}</h2>
                    <input type="text" value={this.state.value}  onChange={this.handler}/>
                    <br/><br/>
                    <textarea value={this.state.txtArea}  onChange={this.txtHandler}></textarea>   
                    
                    </form>
                </div>
        )
}











}