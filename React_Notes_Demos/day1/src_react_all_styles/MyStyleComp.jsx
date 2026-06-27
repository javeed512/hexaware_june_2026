
import  styled from 'styled-components';

export  function MyStyleComp(){


    const Div = styled.div`  
    margin: 20px;  
    border: 5px dashed green;  
    &:hover {  
    background-color: ${(props) => props.hoverColor};  
    }  
    `;  


    const Paragraph = styled.p`  
    font-size: 25px;  
    text-align: center;  
    background-Color: ${ (props)=>props.background};  
    `;  

    return <> 
              <Div hoverColor="Orange">  
                 <Paragraph  background="red">Hello JavaTpoint!!</Paragraph>  
            </Div>  
               
               </>;



}