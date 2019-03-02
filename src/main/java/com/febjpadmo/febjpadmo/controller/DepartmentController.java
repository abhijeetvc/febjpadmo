package com.febjpadmo.febjpadmo.controller;

import com.febjpadmo.febjpadmo.domain.Department;
import com.febjpadmo.febjpadmo.repos.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 24/02/19.
 */

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value="/savedept")
    public String saveDept(@RequestBody Department department){

        departmentRepo.save(department);
        return "dept saved";
    }
}
