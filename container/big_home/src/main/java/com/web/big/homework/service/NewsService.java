package com.web.big.homework.service;

import com.web.big.homework.bean.News;
import com.web.big.homework.dao.Dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NewsService {
    private Dao dao = new Dao();

    public List<News> getAllNews() {
        List<Map<String, Object>> allNews = dao.findAllNews();
        List<News> list = new ArrayList<>();
        for (Map<String, Object> allNew : allNews) {
            News news = new News();
            news.setNewsText((String) allNew.get("news_text"));
            news.setNewsCreateDate((Date) allNew.get("news_create_date"));
            list.add(news);
        }
        return list;
    }
}
