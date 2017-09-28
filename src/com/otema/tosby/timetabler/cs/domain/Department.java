
package com.otema.tosby.timetabler.cs.domain;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Course> course;

    public Department(String name, ArrayList<Course> course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourse() {
        return course;
    }
    
}
