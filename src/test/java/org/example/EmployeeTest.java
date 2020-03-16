package org.example;

public class EmployeeTest  extends Employee{

    public void sound(){
        System.out.println("Bark");
    }

    public void multiplication(int a, int b) {
        c = a * b;
        System.out.println("Product:"+c);


    }

    public static void main(String args[]) {
        //Example of Encapsulation
        Employee enc = new Employee();
        int x = 20, y = 10;
        System.out.println("Example of inheritance");
        Employee demo = new Employee();
        demo.addition(x, y);
        demo.Subtraction(x, y);


        enc.setEmployeeName("Kirby");
        enc.setEmployeeAge(23);
        enc.setEmpSSN(12345678);
        System.out.println(" ");


        System.out.println("Example of Encapsulation");
        System.out.println("Name: " + enc.getEmployeeName());
        System.out.println("SSN: " + enc.getEmpSSN());
        System.out.println("Age: " + enc.getEmployeeAge());
    }

}