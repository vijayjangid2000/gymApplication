package com.vijay.gymapplication.Repository;

import com.vijay.gymapplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.idPk_int in ?1")
    List<User> getUser(Collection<Long> idPk_ints);



}