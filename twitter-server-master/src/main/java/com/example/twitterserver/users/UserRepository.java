package com.example.twitterserver.users;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository
        extends CrudRepository<User, Integer> {
//    @Query (value = "select * from users where users.username = :username and users.password = :password", nativeQuery = true)
//    public User findUserByCredentials(@Param ("username") String username, @Param("password") String password);
//    @Query (value = "update Tuitter.users set value first_name = :user.firstName where user_id: user.user_id", nativeQuery = true)
//    public User updateName(@Param ("username") String username);
}