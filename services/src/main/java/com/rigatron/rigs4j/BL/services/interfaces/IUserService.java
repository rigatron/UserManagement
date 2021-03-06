package com.rigatron.rigs4j.BL.services.interfaces;

import java.util.List;
import com.rigatron.rigs4j.BL.entities.User;

public interface IUserService {

    void createUser(String username, String password);
    void updateUser(int userId, boolean isEnabled, boolean isAdmin);
    List<User> getAllUsers();
    User getUserById(int id);
    User getUserByName(String name);
    void deleteUserById(int id);

}