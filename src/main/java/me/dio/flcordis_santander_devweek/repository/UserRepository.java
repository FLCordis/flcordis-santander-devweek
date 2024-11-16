package me.dio.flcordis_santander_devweek.repository;

import me.dio.flcordis_santander_devweek.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
