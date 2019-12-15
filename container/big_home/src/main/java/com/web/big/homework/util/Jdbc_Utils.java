package com.web.big.homework.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * jdbc 工具类
 * new 一个该类的对象，构造方法中的参数为properties文件的位置
 * @author yangenyu
 *
 */
public class Jdbc_Utils {
    private DataSource dataSource;
    
    public Jdbc_Utils(String url){
    	try {
            Properties properties = new Properties();
            properties.load(Jdbc_Utils.class.getClassLoader().getResourceAsStream(url));
            dataSource =  DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
        	System.out.println("请检查路径");
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
    	Connection conn = null;
    	try{
    		conn = dataSource.getConnection();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return conn;
    }
    
    
    /**
     * 增删改通用方法
     * @param sql 执行的sql语句语句中参数使用？作为占位符
     * @param args sql语句中的参数
     * @return
     */
    public int exectueUpdate(String sql,Object... args) {
        Connection con=null;
        PreparedStatement ps=null;
        try {
        	con = this.getConnection();
        	ps=con.prepareStatement(sql);
            prepareArguments(ps,args);
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	 closeAll(con,ps,null);
        }
        return 0;    
    }
    
    
    /**
     * 查询的通用方法
     * @param sql 执行的sql语句语句中参数使用？作为占位符
     * @param args 语句中的参数
     * @return
     */
    public List<Map<String, Object>> executeQuery(String sql,Object...args) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
        	con = this.getConnection();
        	ps=con.prepareStatement(sql);
            prepareArguments(ps,args);
            rs = ps.executeQuery();
            int count = rs.getMetaData().getColumnCount();
            List<Map<String, Object>> list=new ArrayList<>();
            while (rs.next()) {
                Map<String, Object>map=new HashMap<>();
                
                for (int i = 0; i < count; i++) {
                    Object values = rs.getObject(i+1);
                    String countName = rs.getMetaData().getColumnLabel(i+1);
                    map.put(countName, values);
                }
                list.add(map);
            }
            return list;    
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(con,ps,rs);
        }
        return null;
    }
    
    
    /**
     * 装填参数到preparestatement对象并返回
     * @param ps
     * @param args
     */
    public void prepareArguments(PreparedStatement ps,Object[] args){
        try {
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i+1, args[i]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    /**
     * 关闭连接
     * @param con
     * @param ps
     * @param rs
     */
    public void closeAll(Connection con,PreparedStatement ps,ResultSet rs){
    	try {
            if (ps!=null) {
                ps.close();
            }
            if (con!=null) {
                con.close();
            }
            if(rs != null){
            	rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
