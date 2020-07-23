package com.karan.Bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Emp {
private  String ename;
@NotNull
@Size(min = 1,message = "required")
private int eid;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public int getEid() {
        return eid;
    }
}
