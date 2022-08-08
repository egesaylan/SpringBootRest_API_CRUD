package com.xadmin.SpringBootCrud.Controller;

import com.xadmin.SpringBootCrud.Service.SubjectService;
import com.xadmin.SpringBootCrud.bean.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService service;


    @GetMapping("/subjects")
    public List<Subject> getAllSubjects(){
        return service.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/subjects")
    public void addSubject(@RequestBody Subject subject){
        service.addSubject(subject);
    }

    @PutMapping("/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject){
        service.updateSubject(id, subject);
    }

    @DeleteMapping("/subjects/{id}")
    public void deleteSubject(@PathVariable String id){
        service.deleteSubject(id);
    }
}
