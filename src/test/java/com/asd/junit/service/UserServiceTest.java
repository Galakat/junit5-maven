package com.asd.junit.service;

import com.asd.junit.dto.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserServiceTest {

    @Test
    void usersEmptyIfNoUserAdded() {
        var userService = new UserService();
        List<User> users = userService.getAll();
        assertTrue(users.isEmpty(), "User list should be empty");
    }

}
