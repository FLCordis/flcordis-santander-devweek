package me.dio.flcordis_santander_devweek.service;

import me.dio.flcordis_santander_devweek.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
