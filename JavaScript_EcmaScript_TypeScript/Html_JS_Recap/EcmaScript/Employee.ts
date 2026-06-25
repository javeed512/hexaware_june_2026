

class  Employee{

       //  eid: number = 0;
    //   ename: string = "";


         constructor(private eid  , private ename ){

                this.eid = eid;
                this.ename = ename;

         }

        show(){


            console.log('employee show() called.');
        }



}

    let  emp = new Employee(102,"javeed");

        emp.show();