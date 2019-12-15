package com.web.big.homework.service;

import com.web.big.homework.bean.Major;
import com.web.big.homework.dao.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MajorService {
    private Dao dao = new Dao();

    public List<Major> getAllMajor(){
        List<Map<String, Object>> allMajor = dao.findAllMajor();
        List<Major> list = new ArrayList<>();
        for (Map<String, Object> majorMap : allMajor) {
            Major major = new Major();
            major.setMajorId((int) majorMap.get("major_id"));
            major.setMajorName((String) majorMap.get("major_name"));
            major.setMajorIntroduce((String) majorMap.get("major_introduce"));
            list.add(major);
        }
        return list;
    }
}
