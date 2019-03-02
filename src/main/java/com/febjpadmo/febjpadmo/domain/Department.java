package com.febjpadmo.febjpadmo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by abhi on 24/02/19.
 */
@Entity
public class Department {

    @Id
    private Integer id;
    private String deptName;

    @OneToMany(mappedBy = "department")
    private Set<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
