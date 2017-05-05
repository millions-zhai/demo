package com.project.dao;

import com.project.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by pc on 2017/5/5.
 */
@Repository
public class DemoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Demo getDemo(){
        String sql = "select * from demo where id=?";
        return (Demo) jdbcTemplate.queryForObject(sql, new Object[]{1}, new BeanPropertyRowMapper(Demo.class));
    }
}
