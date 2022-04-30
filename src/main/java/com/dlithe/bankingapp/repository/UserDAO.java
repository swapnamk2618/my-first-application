package com.dlithe.bankingapp.repository;

import com.dlithe.bankingapp.entity.Product;
import com.dlithe.bankingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    //value:value we write sql query
    @Query(value="SELECT * FROM users WHERE user_name=?1", nativeQuery = true)
    User findByName(String userName);

//    @Query(value="SELECT * FROM users WHERE id=?1 AND user_name=?2", nativeQuery = true)
//    User findByNameAndId(int id, String userName);
}
