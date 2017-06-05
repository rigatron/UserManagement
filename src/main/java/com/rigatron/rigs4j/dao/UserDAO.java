package com.rigatron.rigs4j.dao;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.rigatron.rigs4j.models.*;
import org.springframework.jdbc.core.RowMapper;

import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;

/**
 * Created by willi on 6/4/2017.
 */
public class UserDAO {


    private JdbcTemplate jdbcTemplate;

    public UserDAO(BasicDataSource dataSource)
    {
        jdbcTemplate = new JdbcTemplate(dataSource);

    }

    public void insert(User usr)
    {
        String sql = "INSERT INTO public.users(username, password) VALUES (?, ?);";
        try {
            jdbcTemplate.update(sql, new Object[]{usr.getUsername(), usr.getPassword()});
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public User login(User usr)
    {
        String sql = "SELECT * FROM public.users WHERE username = ?;";
        UserRowMapper rowmapper = new UserRowMapper();

        User user = new User();

        try {
            user = (User)jdbcTemplate.queryForObject(sql, new Object[] { usr.getUsername() }, rowmapper);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        return user;
    }


    public List<User> selectTop100()
    {
        String sql = "SELECT * FROM public.users LIMIT 100";

        UserRowMapper rowmapper = new UserRowMapper();

        List<User> users = jdbcTemplate.query(sql, rowmapper);

        return users;
    }

    private class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User usr = new User();

            usr.setUsername(rs.getString("username"));
            usr.setPassword(rs.getString("password"));

            return usr;
        }
    }

}
