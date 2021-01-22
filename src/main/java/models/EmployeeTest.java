package models;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeLec kristen = new EmployeeLec();
        kristen.setFirstName("Kristen");
        kristen.setLastName("Collier");
        kristen.setBirthDate(new Date());
        kristen.setHireDate(new Date());
        kristen.setGender('F');

        System.out.println("Full name is: " + kristen.getFirstName() + " " + kristen.getLastName());
    }
}
