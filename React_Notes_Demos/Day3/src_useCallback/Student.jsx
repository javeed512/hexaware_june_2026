
import React from "react";

function Student({text,count})
{
    console.log("Rending :",text);
    return (
        <div>{text} - {count}</div>
    )
}
export default  React.memo(Student);