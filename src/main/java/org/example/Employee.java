package org.example;

public class Employee {

    //Example of Encapsulation
    private int ssn;
    private String employeeName;
    private int employeeAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public int getEmployeeAge(){
        return employeeAge;
    }

    public void setEmployeeAge(int newValue){
        employeeAge = newValue;
    }

    public void setEmployeeName(String newValue){
        employeeName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }

    //Example of inheritance
    int c;

    public void addition(int a, int b) {
        c = a + b;
        System.out.println("Sum:"+c);
    }

    public void Subtraction(int a, int b) {
        c = a - b;
        System.out.println("Difference"+c);
    }




}

