package design;

//public class name
public abstract class AbstractEmployeeData implements Employee {


    int id;
    String name;
    String department;
    int hours;
    int daysOfWeek;
    int Salary = hours * daysOfWeek;
    String benefits;
    int dob;
    int ssn;
    String FtOrPT;
    boolean workspace;
    int employeeYearsOfExperience;
    String level;
    String nationality;
    int startDate;
    boolean isAlive;

    public AbstractEmployeeData(int id, String name, String department, int hours, int daysOfWeek, int salary, String benefits,
                                int dob, int ssn, String ftOrPT, boolean workspace, int employeeYearsOfExperience, String level,
                                String nationality, int startDate, boolean isAlive, int laughForLaughs) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.hours = hours;
        this.daysOfWeek = daysOfWeek;
        Salary = salary;
        this.benefits = benefits;
        this.dob = dob;
        this.ssn = ssn;
        FtOrPT = ftOrPT;
        this.workspace = workspace;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
        this.level = level;
        this.nationality = nationality;
        this.startDate = startDate;
        this.isAlive = isAlive;
        this.laughForLaughs = laughForLaughs;
    }

    private int laughForLaughs;

    public AbstractEmployeeData(int laughForLaughs) {
        this.laughForLaughs = laughForLaughs;
    }

    public int employeeId(int id) {
        return id;
    }

    public String employeeName(String name) {
        return name;
    }

    public void assignDepartment(String department) {

    }

    public int calculateSalary(int salary) {
        return salary;
    }

    public void benefitLayout(String benefits) {

    }

    public int employeeDOB(int dob) {
        return dob;
    }

    public int employeeSSN(int snn) {
        return ssn;
    }

    public String employeePTOrFT(String FtOrPT ) {
    return FtOrPT;
    }

    public boolean employeeIsWorkingFromHome(boolean workspace) {
        return workspace;
    }

    public int employeeExperience(){
        return 0;
    }



}



