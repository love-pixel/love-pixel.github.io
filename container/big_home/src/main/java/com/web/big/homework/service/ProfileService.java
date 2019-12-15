package com.web.big.homework.service;

import com.web.big.homework.bean.Profile;
import com.web.big.homework.dao.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService {
    private Dao dao = new Dao();
    public List<Profile> getAllProfile(){
        List<Map<String, Object>> allProfile = dao.findAllProfile();
        List<Profile> list = new ArrayList<>();
        for (Map<String, Object> map : allProfile) {
            Profile profile = new Profile();
            profile.setProfileId((int)map.get("profile_id"));
            profile.setProfileMessage((String) map.get("profile_message"));
            list.add(profile);
        }

        return list;
    }
}
