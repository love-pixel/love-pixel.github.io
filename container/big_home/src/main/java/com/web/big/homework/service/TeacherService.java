package com.web.big.homework.service;

import com.web.big.homework.bean.Major;
import com.web.big.homework.bean.Teacher;
import com.web.big.homework.dao.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TeacherService{
    private Dao dao = new Dao();
    public List<Teacher> getAllTeacher(){
        List<Map<String, Object>> allTeachers = dao.findAllTeachers();
        List<Teacher> teachers = new ArrayList<>();

        for (Map<String, Object> allTeacher : allTeachers) {
            Teacher teacher = new Teacher();
            teacher.setTeacherId((int) allTeacher.get("teacher_id"));
            teacher.setTeacherName((String) allTeacher.get("teacher_name"));
            teacher.setTeacherIntroduce((String) allTeacher.get("teacher_introduce"));
            Major major = new Major();
            major.setMajorName((String) allTeacher.get("major_name"));
            teacher.setMajor(major);

            teachers.add(teacher);
        }

        return teachers;
    }

    public Teacher getTeacherByTeacherId(Integer teacherId){
        List<Map<String, Object>> teacherByTeacherId = dao.findTeacherByTeacherId(teacherId);
        Teacher teacher = new Teacher();
        Map<String, Object> map = teacherByTeacherId.get(0);

        teacher.setTeacherId((int) map.get("teacher_id"));
        teacher.setTeacherName((String) map.get("teacher_name"));
        teacher.setTeacherIntroduce((String) map.get("teacher_introduce"));
        Major major = new Major();
        major.setMajorName((String) map.get("major_name"));
        teacher.setMajor(major);

        return teacher;
    }
}
