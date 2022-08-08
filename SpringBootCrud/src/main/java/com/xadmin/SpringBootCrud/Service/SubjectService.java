package com.xadmin.SpringBootCrud.Service;

import com.xadmin.SpringBootCrud.Repository.SubjectRepository;
import com.xadmin.SpringBootCrud.bean.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepository repo;

    public List<Subject> getAllSubjects(){
        List<Subject> subjects = new ArrayList<>();
        repo.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject){
        repo.save(subject);
    }

    public void updateSubject(String id, Subject subject){
        repo.save(subject);
    }

    public void deleteSubject(String id){
        repo.deleteById(id);
    }
}
