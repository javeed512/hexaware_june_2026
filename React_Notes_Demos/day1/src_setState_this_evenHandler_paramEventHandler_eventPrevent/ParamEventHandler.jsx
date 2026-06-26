


// second handler called by first handler
function sum(a,b){

        console.log('sum() is called ...' , (a+b));


}

// first handler  called when button clicked
function handler(){


        sum(4,5);

}



export function ParamEventHandler(){



    return <>
    
    
                <button type="button"  onClick={handler}>Click And Pass Arg</button>

    </>





}