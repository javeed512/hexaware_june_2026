


  function f1(e){  // event handler

        e.preventDefault();

        console.log('f1() is called event occur' , e)

  }


 function PreventEventDemo(){





    return <>
    

    <a href="http://www.google.com" onClick={f1}>Click Me</a>
    
    </>



}

export default PreventEventDemo