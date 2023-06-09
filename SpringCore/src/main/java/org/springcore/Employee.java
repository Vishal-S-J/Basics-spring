package org.springcore;

import lombok.Data;

@Data
public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeePost;

    public Employee() {}

    public Employee(int employeeId, String employeeName, String employeePost) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePost = employeePost;
    }

    @Override
    public String toString() {
        return "=====================================" +
                "\n            EMPLOYEE" +
                "\n=====================================" +
                "\nEmployee_Id........." + employeeId +
                "\nEmployee_Name.......'" + employeeName + "'" +
                "\nEmployee_Post.......'" + employeePost + "'";
    }
}
