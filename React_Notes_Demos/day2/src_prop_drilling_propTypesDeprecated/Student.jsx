

//import PropTypes from "prop-types";
import { Course } from "./Course";

export function Student (props){

    
    return (

        <>
            <h1>Student Component</h1>
        
            <h1>Student Name : {props.name}</h1>
            <h1>Student RollNo : {props.rollno}</h1>

            <Course  name={props.name}></Course>

        </>




    );
}

// Student.propTypes = {

//         name: PropTypes.string.isRequired ,
//         rollno:PropTypes.number.isRequired

// }