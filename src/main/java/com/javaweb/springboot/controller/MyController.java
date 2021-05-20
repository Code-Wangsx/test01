package com.javaweb.springboot.controller;

import com.javaweb.springboot.model.Student;
import com.javaweb.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/selectStudent")
    @ResponseBody
    public Object findStudent(Integer id){
        Student student = studentService.queryByPrimaryKey(id);
        return student;
    }
}
