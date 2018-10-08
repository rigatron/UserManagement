package com.rigatron.rigs4j.BL.config;

import com.rigatron.rigs4j.BL.DAOs.UserDAO;
import com.rigatron.rigs4j.BL.DAOs.UserRoleDAO;
import com.rigatron.rigs4j.BL.DAOs.interfaces.IUserDAO;
import com.rigatron.rigs4j.BL.DAOs.interfaces.IUserRoleDAO;
import com.rigatron.rigs4j.BL.services.UserService;
import com.rigatron.rigs4j.BL.services.interfaces.IUserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class BusinessConfig {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Bean
    public IUserDAO userDAO() {
        UserDAO dao =  new UserDAO();

        dao.setSessionFactory(sessionFactory.getObject());

        return dao;
    }

    @Bean
    public IUserRoleDAO userRoleDAO() {
        UserRoleDAO dao =  new UserRoleDAO();

        dao.setSessionFactory(sessionFactory.getObject());

        return dao;
    }

    @Bean
    public IUserService userService() {
        UserService userService =  new UserService();

        userService.setUserDAO(userDAO());
        userService.setUserRoleDAO(userRoleDAO());

        return userService;
    }
}