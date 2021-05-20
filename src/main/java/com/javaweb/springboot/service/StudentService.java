package com.javaweb.springboot.service;

import com.javaweb.springboot.model.Student;

public interface StudentService {
    Student queryByPrimaryKey(Integer id);
}
