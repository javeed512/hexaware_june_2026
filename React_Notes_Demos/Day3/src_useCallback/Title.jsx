
import React from "react";


function Title()
{
    console.log("title component is render");
    return(
        <h1>React Title component</h1>
    )
}
export default React.memo(Title);