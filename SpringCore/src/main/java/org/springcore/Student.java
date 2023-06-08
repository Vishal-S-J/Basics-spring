package org.springcore;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private List<String> studentLectures;
    private Set<String> studentBooks;
    private Map<String, String> studentPhoneNo;
    private Properties properties;

    public Student () {}

    public Student(int studentId, String studentName, String studentAddress, List<String> studentLectures, Set<String> studentBooks, Map<String, String> studentPhoneNo, Properties properties) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentLectures = studentLectures;
        this.studentBooks = studentBooks;
        this.studentPhoneNo = studentPhoneNo;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "=====================================" +
                "\n            Student" +
                "\n=====================================" +
                "\nStudent_Id........." + studentId +
                "\nStudent_Name.......'" + studentName + '\'' +
                "\nstudentAddress.....'" + studentAddress + '\'' +
                "\nstudentLectures...." + studentLectures +
                "\nstudentBooks......." + studentBooks +
                "\nstudentPhoneNo....." + studentPhoneNo +
                "\nproperties........." + properties;
    }
}
