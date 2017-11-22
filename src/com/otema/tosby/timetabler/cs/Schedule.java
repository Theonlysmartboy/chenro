
package com.otema.tosby.timetabler.cs;

import java.util.ArrayList;


public class Schedule {
    private int ClassNumb=0;
    private ArrayList<Class> classes;
    private Data data;
    public Data getData(){
        return data;
    }

    public Schedule(Data data) {
        this.data = data;
        classes = new ArrayList<Class>(data.getNumberOfClasses());
    }
    public Schedule initialize(){
        
    }
    
}