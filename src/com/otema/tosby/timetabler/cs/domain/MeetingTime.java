package com.otema.tosby.timetabler.cs.domain;

public class MeetingTime {

    private String Id;
    private String time;

    public MeetingTime(String Id,String time) {
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public String getTime() {
        return time;
    }

}
