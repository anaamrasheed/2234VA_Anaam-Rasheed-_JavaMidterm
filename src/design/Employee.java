package design;

public interface Employee {
	
	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    // employeeId() will return employee id.
    int employeeId();

    //employeeName() will return employee name
    String employeeName();

    //assignDepartment() will assign employee to departments
    void assignDepartment();

    //calculate employee salary
    int calculateSalary();

    //employee benefit
    void benefitLayout();

    //employee DOB will return date of birth
    int employeeDOB();

    //employee ssn will return social security number
    int employeeSSN();

    //employeePTorFT() will return full time or part time
    String employeePTOrFT();

    //employeeIsWorkingFromHome() will return location of workspace
    boolean employeeIsWorkingFromHome();

    //employeeExperience() will return employee's previous experience
    int employeeExperience();

    //employeeJobLevel() will return level of Job level








}
