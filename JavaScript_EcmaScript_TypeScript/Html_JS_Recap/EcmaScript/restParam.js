

function f2(...num){


    console.log(num.length);

        num.forEach( (x)=>{ console.log(x)})

}

f2();

f2(10);

f2(10,20);

function fun2(name ,  ...num){

        console.log(name);
        console.log(num.length)

}

fun2('tom');
fun2('javeed', 1 ,2 ,3, 4);




