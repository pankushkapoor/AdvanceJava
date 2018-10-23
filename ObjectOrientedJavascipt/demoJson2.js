function Employee(name, age, salary){
	this.Name = name;
	this.age = age;
	this.salary = salary;
}
var employeeObject = new Employee('Panku',22,40000);
console.log(employeeObject);
JSON.stringify(employeeObject);
console.log(employeeObject)