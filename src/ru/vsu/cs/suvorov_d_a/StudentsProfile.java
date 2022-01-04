package ru.vsu.cs.suvorov_d_a;

import java.util.List;

public class StudentsProfile {
    private final String fullName;
    private final int numberOfGroup;
    private final int numberOfCourse;

    public StudentsProfile(List<String> list) {
        this.fullName = list.get(0);
        this.numberOfGroup = Integer.parseInt(list.get(1));
        this.numberOfCourse = Integer.parseInt(list.get(2));
    }

    public String getFullName() {
        return fullName;
    }

    public int getGroup() {
        return numberOfGroup;
    }

    public int getCourse() {
        return numberOfCourse;
    }

    public String toString() {
        return String.format("%s %s %s", fullName, numberOfGroup, numberOfCourse);
    }
}