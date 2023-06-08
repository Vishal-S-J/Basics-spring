package org.springcore;

import lombok.Data;

@Data
public class HOD {
    private String hodName;
    private Student student;

    public HOD() {}

    @Override
    public String toString() {
        return "HOD{" +
                "hodName='" + hodName + '\'' +
                ", student=" + student +
                '}';
    }
}
