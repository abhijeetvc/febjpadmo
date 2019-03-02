package com.febjpadmo.febjpadmo.controller;

import com.febjpadmo.febjpadmo.domain.Student;
import com.febjpadmo.febjpadmo.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by abhi on 23/02/19.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping(value="/savedata")
    public String saveStudent(@RequestBody Student student){

        studentRepo.save(student);
        return "Data saved";
    }

//    @GetMapping(value="/getdata")
//    public List<Student> getData(){
//        List<Student> list=studentRepo.findAll();
//        return list;
//
//    }

    @GetMapping(value="/updatedata/{id}/{name}")
    public Optional<Student> updateData(@PathVariable Integer id,@PathVariable String name){
        Optional<Student> s=studentRepo.findById(id);

        if(s.isPresent()) {
         Student s1=s.get();
         s1.setName(name);
         studentRepo.save(s1);
        }
        return s;

    }
}
