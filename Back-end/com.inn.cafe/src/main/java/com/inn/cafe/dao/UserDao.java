package com.inn.cafe.dao;

import com.inn.cafe.model.User;
import com.inn.cafe.wrapper.UserWrapper;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmailId(@Param("email") String email);


    List<UserWrapper> getAllUser();

     User findByEmail(String email);
    List<String>  getAllAdmin();
@Transactional
@Modifying
    Integer updateStatus(@Param("status")String status, @Param("id") Integer id);
}
