package com.web.big.homework.service;

import com.web.big.homework.bean.Labortory;
import com.web.big.homework.bean.Major;
import com.web.big.homework.bean.Teacher;
import com.web.big.homework.dao.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LabortoryService  {
    private Dao dao = new Dao();
    public List<Labortory> getAllLabortories(){
        List<Map<String, Object>> allLabortories = dao.findAllLabortories();
        List<Labortory> labortories = new ArrayList<>();

        for (Map<String, Object> allLabortory : allLabortories) {
            Labortory labortory = new Labortory();
            labortory.setLabId((int)allLabortory.get("lab_id"));
            labortory.setLabName((String)allLabortory.get("lab_name"));
            Teacher teacher = new Teacher();
            teacher.setTeacherName((String) allLabortory.get("teacher_name"));
            labortory.setLabTeacher(teacher);
            labortory.setLabStudentName((String) allLabortory.get("lab_student_name"));
            labortory.setLabStatus((int) allLabortory.get("lab_status"));
            labortory.setLabProject((String) allLabortory.get("lab_project"));
            labortory.setLabStudentNumber((int) allLabortory.get("lab_student_number"));
            Major major = new Major();
            major.setMajorName((String) allLabortory.get("major_name"));
            labortory.setMajor(major);

            labortories.add(labortory);
        }

        return labortories;
    }

    public int addLabortory(String labname,
                            Integer labmajorId,
                            Integer labteacherId,
                            String labstudentname,
                            Integer labstatus,
                            String labproject,
                            Integer labstudentnumber){
        Labortory labortory = new Labortory();
        labortory.setLabName(labname);

        Major major = new Major();
        major.setMajorId(labmajorId);
        labortory.setMajor(major);
        labortory.setLabStudentNumber(labstudentnumber);

        Teacher teacher = new Teacher();
        teacher.setTeacherId(labteacherId);
        labortory.setLabTeacher(teacher);

        labortory.setLabProject(labproject);
        labortory.setLabStatus(labstatus);
        labortory.setLabStudentName(labstudentname);
        return dao.insertLabortories(labortory);
    }
}
