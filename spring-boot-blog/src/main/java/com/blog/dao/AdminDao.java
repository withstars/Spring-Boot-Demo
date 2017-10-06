package com.blog.dao;

import com.blog.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class AdminDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public static final String GET_ADMIN_BY_ID_SQL="SELECT * FROM admin WHERE id = ?";

    public Admin getAdminById(int id){
        final Admin admin=new Admin();
        jdbcTemplate.query(GET_ADMIN_BY_ID_SQL, new Object[]{id}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                admin.setId(resultSet.getInt("id"));
                admin.setUsername(resultSet.getString("username"));
                admin.setPassword(resultSet.getString("password"));
            }
        });
        return admin;
    }
}
