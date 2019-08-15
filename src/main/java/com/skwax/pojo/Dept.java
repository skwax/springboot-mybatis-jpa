package com.skwax.pojo;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dept")
public class Dept implements Serializable {

    public Dept() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deptid")
    private long deptID;

    @Column(name = "deptname")
    private String deptName;

    public long getDeptID() {
        return deptID;
    }

    public void setDeptID(long deptID) {
        this.deptID = deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
