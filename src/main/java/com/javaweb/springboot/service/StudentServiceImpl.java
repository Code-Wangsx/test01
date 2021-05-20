package com.javaweb.springboot.service;

import com.javaweb.springboot.mapper.StudentMapper;
import com.javaweb.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
