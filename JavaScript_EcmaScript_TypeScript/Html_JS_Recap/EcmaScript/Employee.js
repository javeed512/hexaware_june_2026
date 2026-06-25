var Employee = /** @class */ (function () {
    //  eid: number = 0;
    //   ename: string = "";
    function Employee(eid, ename) {
        this.eid = eid;
        this.ename = ename;
        this.eid = eid;
        this.ename = ename;
    }
    Employee.prototype.show = function () {
        console.log('employee show() called.');
    };
    return Employee;
}());
var emp = new Employee(102, "javeed");
emp.show();
