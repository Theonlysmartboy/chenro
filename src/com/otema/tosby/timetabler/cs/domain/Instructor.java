/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.otema.tosby.timetabler.cs.domain;

/**
 *
 * @author Theonlysmartboy <Theonlysmartboy@github.com>
 */
public class Instructor {
    private String ID;
    private String name;

    public Instructor(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
  
}
