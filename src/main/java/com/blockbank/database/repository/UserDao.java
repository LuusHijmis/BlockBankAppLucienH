package com.blockbank.database.repository;
/**
 * @author Harold Stevens
 */
import com.blockbank.database.domain.User;
import com.blockbank.database.domain.UserDetails;


public interface UserDao {
    UserDetails save(UserDetails userDetails);
    UserDetails updatePassword(UserDetails userDetails);
    UserDetails findByUsername(String username);
    UserDetails findUserById (int userId);
    UserDetails findUserByEmail (String emailAddress);

}