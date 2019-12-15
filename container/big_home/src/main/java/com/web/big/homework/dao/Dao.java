package com.web.big.homework.dao;

import com.web.big.homework.bean.Labortory;
import com.web.big.homework.util.Jdbc_Utils;

import java.util.List;
import java.util.Map;

public class Dao {
    /**
     * jdbc增删改通用工具类
     */
    private Jdbc_Utils jdbcUtils = new Jdbc_Utils("jdbc-config.properties");

    public List<Map<String, Object>> findUserByNumberAndPassword(String number,String password){
        String sql = "select id,number,password from t_user where number = ? and password = ?";
        List<Map<String, Object>> maps = jdbcUtils.executeQuery(sql,number,password);
        return maps;
    }
    public int addUserWithNumberAndPassword(String number,String password,String email){
        String sql = "insert into t_user(number,password,email) values(?,?,?)";
        return jdbcUtils.exectueUpdate(sql, number, password,email);
    }

    public List<Map<String,Object>> findUserByNumber(String number){
        String sql = "select id from t_user where number = ?";
        return jdbcUtils.executeQuery(sql, number);
    }

    public List<Map<String,Object>> findAllNews(){
        String sql = "select news_id,news_text,news_create_date from t_news";
        return jdbcUtils.executeQuery(sql);
    }

    public List<Map<String,Object>> findAllMajor(){
        String sql = "select major_id,major_name,major_introduce from t_major";
        return jdbcUtils.executeQuery(sql);
    }

    public List<Map<String,Object>> findAllProfile(){
        String sql = "select profile_id,profile_message from t_profile";
        return jdbcUtils.executeQuery(sql);
    }

    public List<Map<String, Object>> findAllTeachers(){
        String sql = "select teacher_id,teacher_name,teacher_introduce,major_name from t_teacher join t_major on t_teacher.major_id=t_major.major_id";
        return jdbcUtils.executeQuery(sql);
    }

    public List<Map<String, Object>> findTeacherByTeacherId(Integer teacherId){
        String sql = "select teacher_id,teacher_name,teacher_introduce,major_name from t_teacher join t_major on t_teacher.major_id=t_major.major_id where teacher_id=?";
        return jdbcUtils.executeQuery(sql,teacherId);
    }

    public List<Map<String, Object>> findAllLabortories(){
        String sql = "select lab_id,lab_name,teacher_name,lab_student_name,lab_status,lab_project,lab_student_number,major_name,lab_major_id from t_labortory join t_teacher on t_labortory.lab_teacher_id = t_teacher.teacher_id join t_major on t_labortory.lab_major_id = t_major.major_id";
        return jdbcUtils.executeQuery(sql);
    }

    public int insertLabortories(Labortory labortory){
        String sql = "insert into t_labortory(lab_name,lab_teacher_id,lab_student_name,lab_status,lab_project,lab_student_number,lab_major_id) values(?,?,?,?,?,?,?)";
        return jdbcUtils.exectueUpdate(sql,labortory.getLabName(),labortory.getLabTeacher().getTeacherId(),labortory.getLabStudentName(),labortory.getLabStatus(),labortory.getLabProject(),labortory.getLabStudentNumber(),labortory.getMajor().getMajorId());
    }
}











