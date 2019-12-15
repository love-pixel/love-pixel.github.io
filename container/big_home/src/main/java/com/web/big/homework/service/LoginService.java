package com.web.big.homework.service;

import com.web.big.homework.dao.Dao;

import java.util.List;
import java.util.Map;

public class LoginService {
    private Dao dao = new Dao();

    public List<Map<String, Object>> doLogin(String number, String password){
        return dao.findUserByNumberAndPassword(number, password);
    }

    public int doRegister(String number,String password,String email){
        List<Map<String, Object>> userByNumber = dao.findUserByNumber(number);
        if(userByNumber != null && userByNumber.size() > 0){
            return 0;
        }else {
            return dao.addUserWithNumberAndPassword(number,password,email);
        }
    }
}
